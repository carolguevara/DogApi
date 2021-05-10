package com.example.apidog.repository

import com.example.apidog.retrofit.DogRetrofit
import com.example.apidog.retrofit.NetworkMapper
import com.example.apidog.room.CacheMapper
import com.example.apidog.room.DogDao
import com.example.apidog.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.lang.Exception

class DogRepository constructor (
    private val dogDao: DogDao,
    private val dogRetrofit: DogRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
        )

{
    suspend fun getDogs(): Flow<DataState> = flow {
        emit(DataState.Error(Exception("error custom")))
        delay(5000)
        try {
            val dogData = dogRetrofit.get()

            val dogMap = networkMapper.mapFromEntityList(dogData)
            for (tempCat in dogMap){
                dogDao.insert(cacheMapper.mapToEntity(tempCat))
            }
            val cacheDog = dogDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cacheDog)))
        }catch (e: HttpException){
            val cacheDog = dogDao.get()
            //EMIT: Es un notificador de que una accion se ha completado o ha dado un error.
            // El medio de transporte es DataState.
            emit(DataState.Success(cacheMapper.mapFromEntityList(cacheDog)))
        }
    }
}
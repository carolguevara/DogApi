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
        emit(DataState.Loading)
        delay(5000)
        try {
            val dogData = dogRetrofit.get()
            val dogMap = networkMapper.mapFromEntityList(dogData)
            for (tempDog in dogMap){
                dogDao.insert(cacheMapper.mapToEntity(tempDog))
            }
            val cacheDog = dogDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cacheDog)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}
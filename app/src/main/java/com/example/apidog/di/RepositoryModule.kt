package com.example.apidog.di

import com.example.apidog.repository.DogRepository
import com.example.apidog.retrofit.DogRetrofit
import com.example.apidog.retrofit.NetworkMapper
import com.example.apidog.room.CacheMapper
import com.example.apidog.room.DogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideDogRepository(
        dogDao: DogDao,
        dogRetrofit: DogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): DogRepository {
        return DogRepository(dogDao, dogRetrofit, cacheMapper, networkMapper)
    }

}
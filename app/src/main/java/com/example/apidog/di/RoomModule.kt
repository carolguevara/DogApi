package com.example.apidog.di

import android.content.Context
import androidx.room.Room
import com.example.apidog.room.DogDao
import com.example.apidog.room.DogDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
object RoomModule
{

    @Singleton
    @Provides
    fun provideDogDb(@ApplicationContext context: Context): DogDatabase {
        return Room
            .databaseBuilder(context, DogDatabase::class.java, DogDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideDogDao(DogDatabase: DogDatabase): DogDao {
        return DogDatabase.dogDao()
    }
}
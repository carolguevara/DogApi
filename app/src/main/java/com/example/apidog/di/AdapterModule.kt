package com.example.apidog.di

import android.app.Application
import com.example.apidog.utils.AdapterDogs
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AdapterModule {

    @Singleton
    @Provides
    fun provideAdapterGenres(application: Application): AdapterDogs {
        return AdapterDogs()
    }
}
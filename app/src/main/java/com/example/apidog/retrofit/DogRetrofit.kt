package com.example.apidog.retrofit

import retrofit2.http.GET

interface DogRetrofit {
    @GET("v3/c1c7072e-f93d-42d7-90c0-f3194ea05421")
    suspend fun get(): List<DogNetworkEntity>

}
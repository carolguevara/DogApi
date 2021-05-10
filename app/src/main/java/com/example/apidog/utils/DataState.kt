package com.example.apidog.utils

import com.example.apidog.model.Dog
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val dogs: List<Dog>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}
package com.example.apidog.intent

sealed class Intent {
    object GetDogEvent: Intent()
    object None: Intent()
}
package com.example.apidog.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import com.example.apidog.R

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        getSupportActionBar()?.setLogo(R.drawable.firullerysml)
        getSupportActionBar()?.setDisplayUseLogoEnabled(true)

        setContentView(R.layout.activity_main)
    }

}
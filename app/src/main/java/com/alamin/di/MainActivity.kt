package com.alamin.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = DaggerAppComponent.builder().build();
        val userRegistrationService = component.getUserRegistrationService()
        userRegistrationService.registerUser("user@gmail.com","1234")
    }
}
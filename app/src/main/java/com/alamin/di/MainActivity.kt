package com.alamin.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = (application as UserApplication).appComponent
        val userRegistrationComponent = DaggerUserRegistrationComponent
            .factory()
            .create(3,component)
        userRegistrationComponent.inject(this);
        userRegistrationService.registerUser("user@gmail.com","1234")
    }
}
package com.alamin.di

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(val userRepository: UserRepository, val emailService: EmailService) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email,password)
        emailService.send(email,"me@gmail.com","Sample Email")
        //Log.d(ContentValues.TAG, "USER $id")

    }
}
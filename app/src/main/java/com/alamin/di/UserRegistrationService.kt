package com.alamin.di

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    val userRepository: UserRepository,
    @EmailAnnotation
    val notificationService: NotificationService,
    val retryCount: Int
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "me@gmail.com", "Sample Email")
        Log.d(ContentValues.TAG, "USER $retryCount")

    }
}
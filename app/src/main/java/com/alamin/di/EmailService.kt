package com.alamin.di

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(): NotificationService {
    override fun send(to: String, form: String, body: String){
        Log.d(TAG, "User Email Sent ")
    }
}
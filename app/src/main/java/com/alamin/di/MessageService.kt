package com.alamin.di

import android.content.ContentValues
import android.util.Log

class MessageService(private val retryCount: Double) : NotificationService {
    override fun send(to: String, form: String, body: String) {
        Log.d(ContentValues.TAG, "User Message Sent With Retry $retryCount")
    }
}
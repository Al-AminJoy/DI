package com.alamin.di

import android.content.ContentValues
import android.util.Log

class MessageService(val retryCount: Int) : NotificationService {
    override fun send(to: String, form: String, body: String) {
        Log.d(ContentValues.TAG, "User Message Sent With Retry $retryCount")
    }
}
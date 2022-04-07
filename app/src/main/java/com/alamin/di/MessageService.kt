package com.alamin.di

import android.content.ContentValues
import android.util.Log

class MessageService : NotificationService {
    override fun send(to: String, form: String, body: String) {
        Log.d(ContentValues.TAG, "User Message Sent")
    }
}
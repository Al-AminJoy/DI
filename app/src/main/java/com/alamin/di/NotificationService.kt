package com.alamin.di

interface NotificationService {
    fun send(to: String, form: String, body: String)
}
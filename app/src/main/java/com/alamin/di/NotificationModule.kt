package com.alamin.di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationModule {
    /*@Provides
    fun sendMessage(): NotificationService {
         return MessageService();
    }*/

    @Binds
    abstract fun sendNotification(emailService: EmailService): NotificationService
}
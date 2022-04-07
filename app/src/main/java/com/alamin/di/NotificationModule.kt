package com.alamin.di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class NotificationModule {

   /* @Binds
    abstract fun sendNotification(emailService: EmailService): NotificationService*/

    @MessageAnnotation
    @Provides
    fun sendMessage(): NotificationService {
        return MessageService();
    }

    @EmailAnnotation
    @Provides
    fun sendEmail(): NotificationService {
        return EmailService();
    }


}
package com.alamin.di

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class NotificationModule() {

   /* @Binds
    abstract fun sendNotification(emailService: EmailService): NotificationService*/

    @ApplicationScope
    @MessageAnnotation
    @Provides
    fun sendMessage(count: Double): NotificationService {
        return MessageService(count);
    }

    @EmailAnnotation
    @Provides
    fun sendEmail(emailService: EmailService): NotificationService {
        return emailService;
    }


}
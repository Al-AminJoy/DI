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
    fun sendMessage(): NotificationService {
        return MessageService(3);
    }

    @EmailAnnotation
    @Provides
    fun sendEmail(emailService: EmailService): NotificationService {
        return emailService;
    }


}
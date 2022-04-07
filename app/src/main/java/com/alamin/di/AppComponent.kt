package com.alamin.di

import dagger.Component

@Component(modules = [NotificationModule::class])
interface AppComponent {
   fun getUserRegistrationService():UserRegistrationService

   fun inject(mainActivity: MainActivity)
}
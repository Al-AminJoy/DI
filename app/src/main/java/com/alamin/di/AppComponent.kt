package com.alamin.di

import dagger.BindsInstance
import dagger.Component

@Component(modules = [NotificationModule::class, AnalyticsModule::class])
interface AppComponent {
   fun getUserRegistrationService():UserRegistrationService

   fun inject(mainActivity: MainActivity)

   @Component.Factory
   interface Factory{
      fun create(@BindsInstance retryCount: Int): AppComponent
    }

}
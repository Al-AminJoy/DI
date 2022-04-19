package com.alamin.di

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
@ApplicationScope
@Component(dependencies = [AppComponent::class], modules = [NotificationModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }
}
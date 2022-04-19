package com.alamin.di

import dagger.BindsInstance
import dagger.Subcomponent
@ApplicationScope
@Subcomponent(modules = [NotificationModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

/*    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }*/
}
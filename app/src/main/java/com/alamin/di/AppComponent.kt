package com.alamin.di

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
   fun getUserRegistrationComponent(): UserRegistrationComponent.Factory }
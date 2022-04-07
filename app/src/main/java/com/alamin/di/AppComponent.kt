package com.alamin.di

import dagger.Component

@Component
interface AppComponent {
   fun getUserRegistrationService():UserRegistrationService
}
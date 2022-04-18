package com.alamin.di

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}
package com.alamin.di

import android.content.ContentValues
import android.util.Log

class Mixpanel: AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(ContentValues.TAG, "Mixpanel $eventName - $eventType ")
    }
}
package com.alamin.di

import android.content.ContentValues
import android.util.Log

class FirebaseAnalytics: AnalyticsService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(ContentValues.TAG, "Firebase $eventName - $eventType ")
    }
}
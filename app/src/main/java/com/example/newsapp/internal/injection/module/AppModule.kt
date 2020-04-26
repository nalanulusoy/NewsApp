package com.example.newsapp.internal.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Module
internal class AppModule {

    @Provides
    @Singleton
    internal fun provideApplicationContext(application: DaggerApplication): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    internal fun provideApplication(application: DaggerApplication): Application {
        return application
    }


}

package com.example.newsapp.internal.injection.module


import com.example.newsapp.features.main.MainActivity
import com.example.newsapp.features.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity

    @ContributesAndroidInjector
    abstract fun splashActivityInjector(): SplashActivity
}

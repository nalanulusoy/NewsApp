package com.example.newsapp.internal.injection.module


import com.example.newsapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {


    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity


}

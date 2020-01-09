package com.example.newsapp.di.module

import com.example.newsapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
 abstract class ActivityModule {

    @ContributesAndroidInjector
   abstract fun mainActivityInjector(): MainActivity


}
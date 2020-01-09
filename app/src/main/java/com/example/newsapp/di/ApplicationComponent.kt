package com.example.newsapp.di

import android.app.Application
import com.example.NewsApplication
import com.example.newsapp.di.module.ActivityModule
import com.example.newsapp.di.module.ApplicationModule
import com.example.newsapp.di.module.FragmentModule
import com.example.newsapp.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
    ApplicationModule::class,
    ActivityModule::class,
    FragmentModule::class,
    ViewModelModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: NewsApplication)


}
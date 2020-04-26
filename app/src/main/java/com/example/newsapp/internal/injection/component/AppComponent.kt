package com.example.newsapp.internal.injection.component


import com.example.newsapp.internal.injection.DaggerApplication
import com.example.newsapp.internal.injection.module.*
import com.example.newsapp.internal.injection.module.AppModule
import com.example.newsapp.internal.injection.module.FragmentsModule
import com.example.newsapp.internal.injection.module.NetworkModule
import com.example.newsapp.internal.injection.viewmodel.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivitiesModule::class,
        FragmentsModule::class,
        AppModule::class,
        NetworkModule::class,
        CacheModule::class,
        ViewModelModule::class
    ]
)
internal interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerApplication>()
}

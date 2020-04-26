package com.example.newsapp.internal.injection.module


import com.example.newsapp.features.HomeFragment
import com.example.newsapp.features.HomeFragmentModule
import com.example.newsapp.internal.injection.scope.HomeScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentsModule {


    @HomeScope
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun contributeHomeFragment(): HomeFragment


}

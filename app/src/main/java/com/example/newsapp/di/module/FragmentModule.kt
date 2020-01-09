package com.example.newsapp.di.module

import com.example.newsapp.feature.home.HomeFragment
import com.example.newsapp.feature.home.di.HomeFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun provideFavoriteFragment(): HomeFragment
}
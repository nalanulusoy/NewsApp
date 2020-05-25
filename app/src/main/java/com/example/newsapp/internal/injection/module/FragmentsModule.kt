package com.example.newsapp.internal.injection.module


import com.example.newsapp.features.BottomNavFragment
import com.example.newsapp.features.BottomNavModule
import com.example.newsapp.features.favorite.FavoriteNewsFragment
import com.example.newsapp.features.favorite.FavoriteNewsFragmentModule
import com.example.newsapp.features.news.HomeFragment
import com.example.newsapp.features.news.HomeFragmentModule
import com.example.newsapp.features.settings.SettingsFragment
import com.example.newsapp.features.settings.SettingsFragmentModule
import com.example.newsapp.internal.injection.scope.FavoriteNewsScope
import com.example.newsapp.internal.injection.scope.HomeScope
import com.example.newsapp.internal.injection.scope.SettingsScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentsModule {

    @HomeScope
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun contributeHomeFragment(): HomeFragment

    @FavoriteNewsScope
    @ContributesAndroidInjector(modules = [FavoriteNewsFragmentModule::class])
    abstract fun contributeFavoriteNewsFragment(): FavoriteNewsFragment

    @SettingsScope
    @ContributesAndroidInjector(modules = [SettingsFragmentModule::class])
    abstract fun contributeSettingsFragment(): SettingsFragment


    @ContributesAndroidInjector(modules = [BottomNavModule::class])
    abstract fun contributeBottomNavFragment(): BottomNavFragment
}

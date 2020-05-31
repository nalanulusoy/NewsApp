package com.example.newsapp.internal.injection.module


import com.example.newsapp.features.BottomNavFragment
import com.example.newsapp.features.BottomNavModule
import com.example.newsapp.features.favorite.FavoritesFragment
import com.example.newsapp.features.favorite.FavoritesFragmentModule
import com.example.newsapp.features.news.NewsFragment
import com.example.newsapp.features.news.NewsFragmentModule
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
    @ContributesAndroidInjector(modules = [NewsFragmentModule::class])
    abstract fun contributeHomeFragment(): NewsFragment

    @FavoriteNewsScope
    @ContributesAndroidInjector(modules = [FavoritesFragmentModule::class])
    abstract fun contributeFavoriteNewsFragment(): FavoritesFragment

    @SettingsScope
    @ContributesAndroidInjector(modules = [SettingsFragmentModule::class])
    abstract fun contributeSettingsFragment(): SettingsFragment


    @ContributesAndroidInjector(modules = [BottomNavModule::class])
    abstract fun contributeBottomNavFragment(): BottomNavFragment
}

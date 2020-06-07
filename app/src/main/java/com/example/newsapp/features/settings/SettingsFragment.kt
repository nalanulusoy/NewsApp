package com.example.newsapp.features.settings


import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment

class SettingsFragment() : BaseFragment<(SettingsViewModel)>(){
    override val layoutId = R.layout.fragment_settings
    companion object{
        const val TITLE_KEY="Settings"
    }
    override fun init() {
        super.init()
        setToolbarTitle(TITLE_KEY)
    }
  }
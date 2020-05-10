package com.example.newsapp


import android.os.Bundle
import com.example.newsapp.base.BaseActivity
import com.example.newsapp.features.HomeFragment

import dagger.android.support.DaggerAppCompatActivity



class MainActivity : BaseActivity<(MainViewModel)>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}





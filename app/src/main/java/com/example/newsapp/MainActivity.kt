package com.example.newsapp


import android.os.Bundle
import com.example.newsapp.feature.home.HomeFragment

import dagger.android.support.DaggerAppCompatActivity



class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openHomeFragment()
    }



    fun openHomeFragment(){
        fragmentManager.beginTransaction().replace(R.id.home_fragment,HomeFragment()).commit()
    }
}

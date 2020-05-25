package com.example.newsapp.features.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.newsapp.features.main.MainActivity
import com.example.newsapp.R
import com.example.newsapp.base.BaseActivity

class SplashActivity : BaseActivity<(SplashViewModel)>(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },
            SPLASH_TIME_OUT
        )
    }
    companion object {
        const val SPLASH_TIME_OUT:Long=3000 // 3 sec
    }
}

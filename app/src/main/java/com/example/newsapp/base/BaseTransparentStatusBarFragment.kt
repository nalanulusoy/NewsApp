package com.example.newsapp.base

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.newsapp.R

abstract class BaseTransparentStatusBarFragment<VM : BaseAndroidViewModel> :
    BaseFragment<VM>() {

    private var systemUiBeforeChange: Int = 0
    private var statusBarColorBeforeChange: Int = 0

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.window?.let { window ->
            systemUiBeforeChange = window.decorView.systemUiVisibility
            window.decorView.systemUiVisibility = systemUiBeforeChange or SYSTEM_UI_TRANSPARENT

            statusBarColorBeforeChange = window.statusBarColor
            window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.colorAccent)
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDestroy() {
        activity?.window?.let { window ->
            window.statusBarColor = statusBarColorBeforeChange
            window.decorView.systemUiVisibility = systemUiBeforeChange
        }

        super.onDestroy()
    }

    companion object {
        private const val SYSTEM_UI_TRANSPARENT =
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    }
}

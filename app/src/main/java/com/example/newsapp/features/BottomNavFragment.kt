package com.example.newsapp.features

import android.os.Bundle
import androidx.navigation.Navigation

import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_bottom_nav.*


class BottomNavFragment : BaseFragment<(BottomNavViewModel)>() {

    override val layoutId = R.layout.fragment_bottom_nav

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val navController = Navigation.findNavController(requireActivity(),
            R.id.bottomNavFragment
        )
        bottomNavigation.setupWithNavController(navController)
    }



}

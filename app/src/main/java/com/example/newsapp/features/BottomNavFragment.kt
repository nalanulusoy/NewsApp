package com.example.newsapp.features

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment.findNavController

import androidx.navigation.ui.setupWithNavController
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import com.example.newsapp.features.main.MainActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_bottom_nav.*


class BottomNavFragment : BaseFragment<(BottomNavViewModel)>() {

    override val layoutId = R.layout.fragment_bottom_nav

    override fun init() {
        super.init()
        setupNav()
    }
    private fun setupNav() {
        val navController = Navigation.findNavController(requireActivity(),
            R.id.bottomNavFragment
        )
        bottomNavigation.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.bottomNavFragmentNews -> showBottomNav()
                R.id.bottomNavFavoriteFragment -> showBottomNav()
                R.id.bottomNavFragmentSettings -> showBottomNav()
                else -> hideBottomNav()
            }
        }
    }

    private fun showBottomNav() {
        bottomNavigation.visibility = View.VISIBLE
        (activity as AppCompatActivity).toolbar.visibility = View.VISIBLE
    }

    private fun hideBottomNav() {
        bottomNavigation.visibility = View.GONE
        (activity as AppCompatActivity).toolbar.visibility = View.GONE
    }
}

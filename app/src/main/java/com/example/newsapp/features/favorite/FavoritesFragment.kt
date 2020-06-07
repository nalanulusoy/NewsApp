package com.example.newsapp.features.favorite

import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment


class FavoritesFragment: BaseFragment<(FavoritesViewModel)>() {
    override val layoutId = R.layout.fragment_favorite_news
    companion object{
        const val TITLE_KEY="Favorites"
    }
    override fun init() {
        super.init()
        setToolbarTitle(TITLE_KEY)
    }
}

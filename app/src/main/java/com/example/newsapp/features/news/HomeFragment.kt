package com.example.newsapp.features.news


import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import androidx.lifecycle.Observer
import com.example.newsapp.data.remote.model.Articles
import kotlinx.android.synthetic.main.layout_home_fragment.*

class HomeFragment : BaseFragment<HomeViewModel>() {

    override val layoutId = R.layout.layout_home_fragment

    override fun initialize() {
        super.initialize()
        viewModel.run {
            fetchTopHeadlinesNews("bbc-news")
            articles.observe(viewLifecycleOwner, Observer {
                initRecyclerView(it)
            })
        }
    }


    private fun initRecyclerView(articles: List<Articles>){
        val adapter = ArticlesAdapter(articles)
        val layoutManager = LinearLayoutManager(context)
        rec_home_news.layoutManager = layoutManager
        rec_home_news.adapter = adapter
    }
}
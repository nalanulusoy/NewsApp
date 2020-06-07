package com.example.newsapp.features.news


import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.base.BaseFragment
import androidx.lifecycle.Observer
import com.example.newsapp.data.remote.model.Articles
import com.example.newsapp.data.remote.model.Sources
import kotlinx.android.synthetic.main.layout_news_fragment.*

class NewsFragment : BaseFragment<NewsViewModel>() {

    override val layoutId = R.layout.layout_news_fragment
    companion object{
        const val TITLE_KEY="News"
        const val COUNTRY="us"
        const val CATEGORY=""


    }
    override fun initialize() {
        super.initialize()
        viewModel.run {
            fetchTopHeadlinesNews(COUNTRY, CATEGORY)
            articles.observe(viewLifecycleOwner, Observer {
                initRecyclerView(it)
            })
        }
    }

    override fun init() {
        super.init()
        setToolbarTitle(TITLE_KEY)
    }
    private fun initRecyclerView(articles: List<Articles>){
        val adapter = ArticlesAdapter(articles)
        val layoutManager = LinearLayoutManager(context)
        recHomeNews.layoutManager = layoutManager
        recHomeNews.adapter = adapter
    }
}
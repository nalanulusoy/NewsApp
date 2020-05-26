package com.example.newsapp.features.news

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.newsapp.base.BaseAndroidViewModel
import com.example.newsapp.data.remote.model.Articles
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.domain.TopHeadlinesSourceUseCase
import com.example.newsapp.domain.TopHeadlinesWordUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor( application: Application,private val useCase: TopHeadlinesSourceUseCase):BaseAndroidViewModel(application) {



    val articles = MutableLiveData<List<Articles>>()
    fun fetchTopHeadlinesNews(source:String) {
        if (articles.value == null) {
            viewModelScope.launch {
                val topHeadlinesSource =
                    useCase.run(TopHeadlinesSourceUseCase.Params(source))

                onUIThread {
                    topHeadlinesSource.either(::handleFailure, :: postTopHeadlines)
                }
            }
        }
    }
    private fun postTopHeadlines(news: News) {
        articles.value = news.getArticles()
    }
}

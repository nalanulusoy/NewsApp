package com.example.newsapp.features

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.newsapp.base.BaseAndroidViewModel
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.domain.TopHeadlinesWordUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor( application: Application,private val useCase: TopHeadlinesWordUseCase):BaseAndroidViewModel(application) {

    private val topHeadlines = MutableLiveData<News>()


    fun fetchTopHeadlinesNews(query:String) {
        if (topHeadlines.value == null) {
            bgScope.launch {
                val topHeadlinesWord =
                    useCase.run(TopHeadlinesWordUseCase.Params(query))

                onUIThread {
                    topHeadlinesWord.either(::handleFailure, :: postTopHeadlines)
                }
            }
        }
    }
    private fun postTopHeadlines(news: News) {
        topHeadlines.value = news
    }
}

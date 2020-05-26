package com.example.newsapp.domain

import com.example.newsapp.data.remote.model.News
import com.example.newsapp.data.repository.TopHeadlinesSourceRepository
import com.example.newsapp.internal.UseCase
import javax.inject.Inject

class TopHeadlinesSourceUseCase @Inject constructor(
    private val repository: TopHeadlinesSourceRepository
) : UseCase<News, TopHeadlinesSourceUseCase.Params>() {

    override suspend fun buildUseCase(params: Params):News = repository.fetchTopHeadlinesSource(params.source)

    data class Params(val source:String)

}
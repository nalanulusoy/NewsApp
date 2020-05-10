package com.example.newsapp.domain


import com.example.newsapp.data.remote.model.News
import com.example.newsapp.data.repository.TopHeadlinesWordRepository
import com.example.newsapp.internal.UseCase
import javax.inject.Inject

class TopHeadlinesWordUseCase @Inject constructor(
    private val repository: TopHeadlinesWordRepository
) : UseCase<News, TopHeadlinesWordUseCase.Params>() {

    override suspend fun buildUseCase(params: Params):News = repository.fetchTopHeadlinesWord(params.query)

    data class Params(val query:String)
}

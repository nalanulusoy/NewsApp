package com.example.newsapp.domain

import com.example.newsapp.data.remote.model.News
import com.example.newsapp.data.repository.TopHeadlinesCountryRepository
import com.example.newsapp.internal.UseCase
import javax.inject.Inject

class TopHeadlineCountryUsecase @Inject constructor(
    private val repository: TopHeadlinesCountryRepository
) : UseCase<News, TopHeadlineCountryUsecase.Params>() {

    override suspend fun buildUseCase(params: Params):News = repository.fetchTopHeadlinesCountry(params.country,params.category)

    data class Params(val country:String,val category:String)

}
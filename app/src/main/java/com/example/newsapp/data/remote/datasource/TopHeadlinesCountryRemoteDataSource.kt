package com.example.newsapp.data.remote.datasource


import com.example.newsapp.data.remote.BaseRemoteDataSource
import com.example.newsapp.data.remote.api.TopHeadlinesCountryService
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant
import io.reactivex.Observable
import javax.inject.Inject

class TopHeadlinesCountryRemoteDataSource @Inject constructor(
    private val service: TopHeadlinesCountryService
) : BaseRemoteDataSource() {

suspend fun TopHeadlinesCountry(country:String,category:String): News =invoke {
    service.getTopHeadlinesCountry(
        country, category,
        Constant.Api.API_KEY
    )
}
}

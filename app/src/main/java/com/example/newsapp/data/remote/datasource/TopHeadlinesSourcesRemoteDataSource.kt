package com.example.newsapp.data.remote.datasource

import com.example.newsapp.data.remote.BaseRemoteDataSource
import com.example.newsapp.data.remote.api.TopHeadlinesSourcesService
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant
import io.reactivex.Single
import javax.inject.Inject

class TopHeadlinesSourcesRemoteDataSource @Inject constructor(
    private val sourcesService: TopHeadlinesSourcesService
) : BaseRemoteDataSource() {
    suspend fun TopHeadlinesSources(sources:String): News =invoke {
        sourcesService.getTopHeadlinesSources(sources, Constant.Api.API_KEY)
    }
}
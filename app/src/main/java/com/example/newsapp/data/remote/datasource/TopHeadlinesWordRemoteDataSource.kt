package com.example.newsapp.data.remote.datasource


import com.example.newsapp.data.remote.BaseRemoteDataSource
import com.example.newsapp.data.remote.api.TopHeadlinesWordService
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant
import io.reactivex.Observable
import javax.inject.Inject

class TopHeadlinesWordRemoteDataSource@Inject constructor(
private val sourcesService: TopHeadlinesWordService
) : BaseRemoteDataSource() {
    suspend fun TopHeadlinesWord(query:String): News =sourcesService.getTopHeadlinesWord(query,
        Constant.Api.API_KEY)

}
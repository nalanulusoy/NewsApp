package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.datasource.TopHeadlinesWordRemoteDataSource
import com.example.newsapp.internal.util.Constant
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlinesWordRepository @Inject constructor(
    private val remoteDataSource: TopHeadlinesWordRemoteDataSource

) {

    suspend fun fetchTopHeadlinesWord(query:String) = remoteDataSource.TopHeadlinesWord(query)
}
package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.datasource.TopHeadlinesWordRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlinesWordRepository @Inject constructor(
    private val remoteDataSource: TopHeadlinesWordRemoteDataSource

) {

    suspend fun fetchTopHeadlinesWord(query:String) = remoteDataSource.TopHeadlinesWord(query)
}
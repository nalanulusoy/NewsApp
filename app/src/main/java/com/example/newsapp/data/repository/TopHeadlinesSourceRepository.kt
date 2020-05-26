package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.datasource.TopHeadlinesSourcesRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlinesSourceRepository @Inject constructor(
    private val sourcesRemoteDataSource: TopHeadlinesSourcesRemoteDataSource

) {
    suspend fun fetchTopHeadlinesSource(source:String) = sourcesRemoteDataSource.TopHeadlinesSources(source)
}
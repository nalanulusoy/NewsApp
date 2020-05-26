package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.datasource.TopHeadlinesCountryRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TopHeadlinesCountryRepository @Inject constructor(
    private val remoteDataSource: TopHeadlinesCountryRemoteDataSource

) {
    suspend fun fetchTopHeadlinesCountry(country:String,category:String) = remoteDataSource.TopHeadlinesCountry(country,category)
}
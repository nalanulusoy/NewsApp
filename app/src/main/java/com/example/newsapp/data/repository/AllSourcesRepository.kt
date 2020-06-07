package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.datasource.AllSourcesRemoteDataSource
import com.example.newsapp.data.remote.datasource.TopHeadlinesCountryRemoteDataSource
import com.example.newsapp.data.remote.model.AllSources
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AllSourcesRepository @Inject constructor(
    private val remoteDataSource: AllSourcesRemoteDataSource

) {
    suspend fun fetchAllSources() : AllSources = remoteDataSource.AllSources()
}
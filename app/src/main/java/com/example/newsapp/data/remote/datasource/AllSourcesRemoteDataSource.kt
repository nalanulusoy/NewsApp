package com.example.newsapp.data.remote.datasource


import com.example.newsapp.data.remote.BaseRemoteDataSource
import com.example.newsapp.data.remote.api.AllSourcesService
import com.example.newsapp.data.remote.model.AllSources
import com.example.newsapp.internal.util.Constant

import javax.inject.Inject

class AllSourcesRemoteDataSource @Inject constructor(
    private val service: AllSourcesService
) : BaseRemoteDataSource() {

suspend fun AllSources(): AllSources =invoke {
    service.getAllSources(
        Constant.Api.API_KEY
    )
}
}

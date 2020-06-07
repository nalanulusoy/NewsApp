package com.example.newsapp.data.remote.api


import com.example.newsapp.data.remote.model.AllSources
import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface AllSourcesService {
    @GET(Constant.Api.ALL_SOURCES)
   suspend fun getAllSources(
        @Query(API_KEY) apiKey: String
    ): AllSources
    companion object {
        const val API_KEY="apiKey"
    }
}
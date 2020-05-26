package com.example.newsapp.data.remote.api


import com.example.newsapp.data.remote.model.News
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.newsapp.internal.util.Constant
interface TopHeadlinesSourcesService {
    @GET(Constant.Api.TOP_HEADLİNES)
  suspend  fun getTopHeadlinesSources(@Query(SOURCES) sources: String,
                               @Query(API_KEY) apiKey: String): News

    companion object {
        const val SOURCES = "sources"
        const val API_KEY="apiKey"
    }
}
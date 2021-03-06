package com.example.newsapp.data.remote.api

import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesWordService {

    @GET(Constant.Api.TOP_HEADLİNES)
  suspend  fun getTopHeadlinesWord(@Query(QUERY) query: String,
                            @Query(API_KEY) apiKey: String): News

    companion object {
        const val QUERY = "q"
        const val API_KEY="apiKey"
    }
}
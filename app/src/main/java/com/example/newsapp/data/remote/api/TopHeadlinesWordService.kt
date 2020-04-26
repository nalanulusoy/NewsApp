package com.example.newsapp.data.remote.api

import com.example.newsapp.data.model.News
import com.example.newsapp.internal.util.Constant
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesWordService {

    @GET(Constant.Api.TOP_HEADLİNES)
    fun getTopHeadlinesWord(@Query("q") query: String,
                            @Query("apiKey") apiKey: String): Observable<News>
}
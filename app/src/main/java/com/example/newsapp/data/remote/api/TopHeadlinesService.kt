package com.example.newsapp.data.remote.api


import com.example.newsapp.data.model.News
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.newsapp.internal.util.Constant
interface TopHeadlinesService {
    @GET(Constant.Api.TOP_HEADLİNES)
    fun getTopHeadlines(@Query("country") sources: String,
                        @Query("apiKey") apiKey: String): Single<List<News>>


}
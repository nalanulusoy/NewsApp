package com.example.newsapp.feature.home.data

import com.example.newsapp.feature.home.data.response.News

import com.example.newsapp.util.Constants.TOP_HEADLİNES
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET(TOP_HEADLİNES)
    fun getTopHeadlines(@Query("country") sources: String,
                        @Query("apiKey") apiKey: String): Single<List<News>>


    @GET(TOP_HEADLİNES)
    fun getTopHeadlinesCountry(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Observable<News>



    @GET(TOP_HEADLİNES)
    fun getTopHeadlinesWord(@Query("q") query: String,
                            @Query("apiKey") apiKey: String): Observable<News>


}
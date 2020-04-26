package com.example.newsapp.data.remote.api


import com.example.newsapp.data.model.News
import com.example.newsapp.internal.util.Constant


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesCountryService {
    @GET(Constant.Api.TOP_HEADLİNES)
    fun getTopHeadlinesCountry(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Observable<News>
}
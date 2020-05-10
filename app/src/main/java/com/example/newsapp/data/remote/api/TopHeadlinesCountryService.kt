package com.example.newsapp.data.remote.api


import com.example.newsapp.data.remote.model.News
import com.example.newsapp.internal.util.Constant


import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesCountryService {
    @GET(Constant.Api.TOP_HEADLİNES)
   suspend fun getTopHeadlinesCountry(
        @Query(COUNTRY) country: String,
        @Query(CATEGORY) category: String,
        @Query(Constant.Api.API_KEY) apiKey: String
    ): News
    companion object {
        const val COUNTRY = "country"
        const val CATEGORY = "category"
    }
}
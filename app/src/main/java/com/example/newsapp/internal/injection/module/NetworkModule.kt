package com.example.newsapp.internal.injection.module

import android.content.Context
import androidx.databinding.library.BuildConfig
import com.example.newsapp.data.remote.api.AllSourcesService
import com.example.newsapp.data.remote.api.TopHeadlinesCountryService
import com.example.newsapp.data.remote.api.TopHeadlinesSourcesService
import com.example.newsapp.data.remote.api.TopHeadlinesWordService
import com.example.newsapp.internal.util.Constant
import dagger.Module
import dagger.Provides
import java.io.File
import javax.inject.Singleton
import okhttp3.Cache
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
internal class NetworkModule {

    companion object {
        private const val CLIENT_TIME_OUT = 120L
        private const val CLIENT_CACHE_SIZE = 10 * 1024 * 1024L
        private const val CLIENT_CACHE_DIRECTORY = "http"
    }

    /**
     * Create Cache object for OkHttp instance
     */
    @Provides
    @Singleton
    internal fun providesCache(context: Context): Cache = Cache(
        File(
            context.cacheDir,
            CLIENT_CACHE_DIRECTORY
        ),
        CLIENT_CACHE_SIZE
    )



    @Provides
    @Singleton
    internal fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        return loggingInterceptor
    }


    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constant.Api.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }


    @Provides
    @Singleton
    fun provideTopHeadlinesCountryService(retrofit: Retrofit): TopHeadlinesCountryService {
        return retrofit.create(TopHeadlinesCountryService::class.java)
    }

    @Provides
    @Singleton
    fun provideTopHeadlinesService(retrofit: Retrofit): TopHeadlinesSourcesService {
        return retrofit.create(TopHeadlinesSourcesService::class.java)
    }

    @Provides
    @Singleton
    fun provideTopHeadlinesWordService(retrofit: Retrofit): TopHeadlinesWordService {
        return retrofit.create(TopHeadlinesWordService::class.java)
    }

}

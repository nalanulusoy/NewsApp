package com.example.newsapp.internal.util

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.Locale as JavaLocale

object Constant {

    object Locale {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        val LOCALE_TURKISH = JavaLocale.forLanguageTag("tr-TR")
        val LOCALE_ENGLISH = JavaLocale.ENGLISH
    }

    object Api{
        const  val API_KEY = "4463609098bb4241896429a6d4962bbb"
        const val BASE_URL ="https://newsapi.org/v2/"
        const val TOP_HEADLİNES = "top-headlines"
        const val ALL_SOURCES ="sources"
        const val TOP_CATEGORY = "technology"
        const val TOP_COUNTRY = "tr"
        const val TOP_SOURCE = "bbc-news"
    }
}

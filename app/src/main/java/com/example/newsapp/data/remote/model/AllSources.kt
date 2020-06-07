package com.example.newsapp.data.remote.model

class AllSources {
    private var status: String? = null
    private var sources: List<Sources>? = null
    fun getSources(): List<Sources>? {
        return sources
    }
    fun setSources(sources: List<Sources>) {
        this.sources = sources
    }
}
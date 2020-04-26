package com.example.newsapp.data.model



class News {
    private var status: String? = null
    private var totalResults: Int = 0
    private var articles: List<Articles>? = null
    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getTotalResults(): Int {
        return totalResults
    }

    fun setTotalResults(totalResults: Int) {
        this.totalResults = totalResults
    }

    fun getArticles(): List<Articles>? {
        return articles
    }

    fun setArticles(articles: List<Articles>) {
        this.articles = articles
    }

}

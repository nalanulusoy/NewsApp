package com.example.newsapp.data.remote.model

class Sources {
    private var country: String? = null
    private var name: String? = null

    private var description: String? = null

    private var language: String? = null

    private var id: String? = null

    private var category: String? = null

    private var  url: String?=null
    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }
    fun getCategory(): String? {
        return category
    }
    fun setCategory(category: String) {
        this.category = category
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun getLanguage(): String? {
        return language
    }

    fun setLanguage(language: String) {
        this.language = language
    }

}
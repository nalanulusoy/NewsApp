package com.example.newsapp.feature.home.data.response

class Source {
    private var name: String? = null

    private var id: String? = null
    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }
}

package com.example.newsapp.data.remote.model

class Articles {

    private var publishedAt: String? = null

    private var author: String? = null

    private var urlToImage: String? = null

    private var description: String? = null

    private var source: Source? = null

    private var title: String? = null

    private var url: String? = null

    private var content: String? = null
    fun getPublishedAt(): String? {
        return publishedAt
    }

    fun setPublishedAt(publishedAt: String) {
        this.publishedAt = publishedAt
    }

    fun getAuthor(): String? {
        return author
    }

    fun setAuthor(author: String) {
        this.author = author
    }

    fun getUrlToImage(): String? {
        return urlToImage
    }

    fun setUrlToImage(urlToImage: String) {
        this.urlToImage = urlToImage
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getSource(): Source? {
        return source
    }

    fun setSource(source: Source) {
        this.source = source
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getContent(): String? {
        return content
    }

    fun setContent(content: String) {
        this.content = content
    }

}

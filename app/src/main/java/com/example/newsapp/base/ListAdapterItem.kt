package com.example.newsapp.base

interface ListAdapterItem {
    val id: Long

    override fun equals(other: Any?): Boolean
}

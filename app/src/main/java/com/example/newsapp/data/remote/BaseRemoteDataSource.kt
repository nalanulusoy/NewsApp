package com.example.newsapp.data.remote

import com.example.newsapp.internal.util.Failure


open class BaseRemoteDataSource {

    suspend fun <O> invoke(serviceFunction: suspend () -> O): O {
        return try {
            serviceFunction()
        } catch (exception: Exception) {
            throw asFailure(exception)
        }
    }

    private fun asFailure(exception: Exception): Failure {
        return when (exception) {
            is Failure -> exception
            else -> Failure.UnknownError(exception)
        }
    }
}

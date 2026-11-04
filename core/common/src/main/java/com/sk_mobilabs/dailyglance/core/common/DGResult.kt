package com.sk_mobilabs.dailyglance.core.common

sealed interface DGResult<out T> {
    data class Success<T>(val response: T?) : DGResult<T>
    data class Error(val httpStatusCode: Int, val errorBody: String? = null) : DGResult<Nothing>
    data class Failure(val failure: DGCommonFailures? = null) : DGResult<Nothing>
    data object ConnectivityError : DGResult<Nothing>
}

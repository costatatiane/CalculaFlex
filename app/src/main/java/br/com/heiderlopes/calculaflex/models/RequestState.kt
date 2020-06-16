package br.com.heiderlopes.calculaflex.models

sealed class RequestState <out T> {

    object Loading: RequestState<Nothing>()
    data class Success<T>(val data: T): RequestState<T>()
    data class Error(var throwable: Throwable): RequestState<Nothing>()

}
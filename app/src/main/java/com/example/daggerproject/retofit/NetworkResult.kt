package com.example.daggerproject.retofit

sealed class NetworkResult<out R>{
    data class Success<T>(val data:T):NetworkResult<T>()
    data class Error<T>(val message:String):NetworkResult<T>()
    object Loading:NetworkResult<Nothing>()

}

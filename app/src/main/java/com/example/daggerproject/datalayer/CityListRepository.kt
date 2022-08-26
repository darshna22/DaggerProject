package com.example.daggerproject.datalayer

import com.example.daggerproject.retofit.RetrofitService
import com.example.daggerproject.retofit.result
import kotlinx.coroutines.delay
import javax.inject.Inject


class CityListRepository @Inject constructor( val retrofitService: RetrofitService/*,coroutineContext: CoroutineContext*/) {
     fun getAllMovies() = result {
        retrofitService.getAllCityName()
    }


    suspend fun getData():Int{
        delay(2000)
        return 20
    }
}
package com.example.daggerproject.retofit

import com.example.daggerproject.model.CityNameListResponse
import com.example.daggerproject.model.CityNameListResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface RetrofitService {

    @GET
    suspend fun getCityList(@Url url: String): Response<CityNameListResponse>

    @GET("topcities/50?apikey=y8yi2js4ASJdz0NCSQA8muOAP54mOdLF")
    suspend fun getAllCityName(): Response<List<CityNameListResponseItem>>
}
package com.example.sunnyweather.logic.network

import com.example.sunnyweather.logic.model.PlaceResponse

interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}
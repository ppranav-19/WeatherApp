package com.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import com.weatherapp.*
import retrofit.Call
import retrofit.*
import retrofit.http.Query
import retrofit2.http.GET

/**
 * An Interface which defines the HTTP operations Functions.
 */
interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Call<WeatherResponse>
}
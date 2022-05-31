package com.bignerdranch.android.kursweather.API

import com.bignerdranch.android.kursweather.Database.ForecastDayDto
import com.bignerdranch.android.kursweather.Database.ForecastDto
import com.bignerdranch.android.kursweather.Database.WeatherResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json?key=585716feaba7447393554521222505&q=Krasnoyarsk&days=1&aqi=no&alerts=no")
    suspend fun getWeather(
       @Query("days") days: Int,
        @Query("aqi") aqi: String = "no",
     @Query("alerts") alerts: String = "no"
    ): Response<WeatherResponseDto>


}
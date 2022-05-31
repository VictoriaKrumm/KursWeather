package com.bignerdranch.android.kursweather.Database

import com.google.gson.annotations.SerializedName

data class WeatherResponseDto( //весь JSON
    @SerializedName("forecast")
    val forecast: ForecastDto?
)

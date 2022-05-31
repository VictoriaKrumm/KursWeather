package com.bignerdranch.android.kursweather

import com.google.gson.annotations.SerializedName

data class WeatherForecast(
    @SerializedName("forecast")
    val forecast: String?
)

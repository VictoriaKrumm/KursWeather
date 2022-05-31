package com.bignerdranch.android.kursweather.Database

import com.google.gson.annotations.SerializedName

data class ForecastDto(
    @SerializedName("forecastday")
    val forecastday: ArrayList<ForecastDayDto>?
)

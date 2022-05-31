package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.API.HoursList

data class WeatherState(
    val isLoading: Boolean = false,
    val gameDetails: HoursList? = null,
    val error: String = ""
)

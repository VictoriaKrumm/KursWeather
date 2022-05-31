package com.bignerdranch.android.kursweather.Database

import com.bignerdranch.android.kursweather.API.HoursList

data class ForecastDay( //получаем список часов
    val hours: ArrayList<HoursList>?
)

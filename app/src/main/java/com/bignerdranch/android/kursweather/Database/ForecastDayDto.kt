package com.bignerdranch.android.kursweather.Database

import com.google.gson.annotations.SerializedName

data class ForecastDayDto( //получаем список часов
    @SerializedName("hour")
    val hours: ArrayList<HoursListDto>?
    )

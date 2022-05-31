package com.bignerdranch.android.kursweather.Database

import com.google.gson.annotations.SerializedName
import java.sql.Time
import java.text.DecimalFormat

data class HoursListDto( //экземпляр массива часов

    @SerializedName("time")
    val time: String?,

    @SerializedName("temp_c")
    val temp_c: String?,

    @SerializedName("wind_kph")
    val wind_kph: String?,

    @SerializedName("humidity")
    val humidity: Int?,



)

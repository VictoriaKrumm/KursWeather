package com.bignerdranch.android.kursweather.API


import android.os.Parcelable

import kotlinx.parcelize.Parcelize
import java.sql.Time
import java.text.DecimalFormat

@Parcelize
data class  HoursList( //экземпляр массива часов

    val time: String?,
    val temp_c: String?,
    val wind_kph: String?,
    val humidity: Int?,

): Parcelable

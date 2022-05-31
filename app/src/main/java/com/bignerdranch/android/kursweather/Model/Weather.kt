package com.bignerdranch.android.kursweather.Model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "Weather_table")
data class Weather (
    @PrimaryKey var id: String,
    @ColumnInfo(name = "Name") var name: String,
    @ColumnInfo(name = "Description") var description: String,
    @ColumnInfo(name = "Weather") var weather: Double?,

): Parcelable
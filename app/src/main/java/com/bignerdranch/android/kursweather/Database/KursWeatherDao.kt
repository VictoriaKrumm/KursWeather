package com.bignerdranch.android.kursweather.Database

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface KursWeatherDao {

 /*   @Query("SELECT * FROM weather_table ORDER BY id ASC")
    fun getWeather(): LiveData<List<Weather>>


    @Query("SELECT * FROM weather_table WHERE id = :id")
    fun getWeather(id: String): LiveData<Weather?>

    @Update
    suspend fun updateWeather(weather: Weather)*/

}

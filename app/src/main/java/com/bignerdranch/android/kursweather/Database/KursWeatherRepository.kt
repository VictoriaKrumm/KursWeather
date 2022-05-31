package com.bignerdranch.android.kursweather.Database

/*private const val DATABASE_NAME = "kursWeather"

class KursWeatherRepository(private val kursWeatherDao: KursWeatherDao){

    val getWeather: LiveData<List<Weather>> = kursWeatherDao.getWeather()
*/
interface KursWeatherRepository {
    suspend fun getWeather(days: Int, aqi: String, alerts: String): WeatherResponse
}
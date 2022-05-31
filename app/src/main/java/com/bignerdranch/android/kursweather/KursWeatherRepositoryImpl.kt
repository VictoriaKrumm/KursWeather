package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.API.WeatherApi
import com.bignerdranch.android.kursweather.Database.Forecast
import com.bignerdranch.android.kursweather.Database.ForecastDay
import com.bignerdranch.android.kursweather.Database.KursWeatherRepository
import com.bignerdranch.android.kursweather.Database.WeatherResponse

class KursWeatherRepositoryImpl constructor(private val apiService: WeatherApi) : KursWeatherRepository,
    SafeApiRequest() {

    override suspend fun getWeather(days: Int, aqi: String, alerts: String): WeatherResponse {
        println("Done")

        val weatherResponse = safeApiRequest {
            apiService.getWeather(
                days,
                aqi,
                alerts
            )
        }

        return weatherResponse.toDomain()
    }
}
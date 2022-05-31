package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.Database.Forecast
import com.bignerdranch.android.kursweather.Database.ForecastDay
import com.bignerdranch.android.kursweather.Database.KursWeatherRepository
import com.bignerdranch.android.kursweather.Database.WeatherResponse

class GetWeatherUseCase constructor(private val kursWeatherRepository: KursWeatherRepository){
    suspend operator fun invoke(days: Int, aqi: String, alerts: String): WeatherResponse =
        kursWeatherRepository.getWeather(days, aqi, alerts)
    /*suspend operator fun invoke(aqi: Boolean): Resource<HoursList> {
        val hoursList = kursWeatherRepository.getWeather(aqi)
        return Resource.Success(hoursList)
             */
    }
        //kursWeatherRepository.getWeather(aqi)

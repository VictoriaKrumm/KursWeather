package com.bignerdranch.android.kursweather.API

import android.util.Log
import com.bignerdranch.android.kursweather.Database.HoursListDto
import com.bignerdranch.android.kursweather.LoadParameters
import com.bignerdranch.android.kursweather.ViewModel.WeatherViewModel
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException


class WeatherClientAPI {

   /* suspend fun getWeatherList(weatherViewModel: WeatherViewModel) {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://api.weatherapi.com/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val weatherAPI = retrofit.create(WeatherApi::class.java)
        val result : List<HoursListDto> = WeatherApi.getWeather()

        for (item in result) {
            var weather: Weather =
                Weather(
                    item.id,
                    item.name,
                    item.maxPrice,
                    item.maxPriceDate,
                    item.marketCapRank,
                    item.currentPrice,
                    item.priceCP1H,
                    item.priceCP24H,
                    item.priceCP7D,
                    item.priceCP14D,
                    item.priceCP30D,
                    item.priceCP200D
                )
            GlobalScope.launch {
            }
        }

        LoadParameters.LoadIsOver()

    */
    }

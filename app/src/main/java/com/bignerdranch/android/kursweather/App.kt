package com.bignerdranch.android.kursweather

import android.app.Application
import com.bignerdranch.android.kursweather.API.HoursList
import com.bignerdranch.android.kursweather.API.WeatherApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {
    lateinit var weatherApi: WeatherApi
    //lateinit var hoursList: HoursList
    override fun onCreate() {
        super.onCreate()
        initkoin()
        //init()
    }
    /*private fun init() {
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


        weatherApi = retrofit.create(WeatherApi::class.java)
    }*/
    private fun initkoin(){
        val modules = listOf(domainModule, repositoryModule, presentationModule, networkModule)
        startKoin {
            //androidLogger()
            androidContext(this@App)
            modules(modules)
        }
    }
}
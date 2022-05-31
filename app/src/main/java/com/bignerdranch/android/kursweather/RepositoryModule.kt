package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.Database.KursWeatherRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<KursWeatherRepository> { KursWeatherRepositoryImpl(get()) }
}
package com.bignerdranch.android.kursweather

import org.koin.dsl.module

val domainModule = module {
    single { GetWeatherUseCase(get()) }

}

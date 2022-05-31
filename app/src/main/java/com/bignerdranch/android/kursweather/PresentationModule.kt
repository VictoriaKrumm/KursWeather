package com.bignerdranch.android.kursweather

import com.bignerdranch.android.kursweather.ViewModel.WeatherViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val presentationModule = module {
    viewModel { WeatherViewModel(get()) }
}
val loadPresentationModule by lazy {
    val modules = listOf(presentationModule)
    loadKoinModules(modules)
}
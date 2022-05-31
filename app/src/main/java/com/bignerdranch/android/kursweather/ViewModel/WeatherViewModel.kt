package com.bignerdranch.android.kursweather.ViewModel

import androidx.lifecycle.*
import com.bignerdranch.android.kursweather.Database.Forecast
import com.bignerdranch.android.kursweather.Database.ForecastDay
import com.bignerdranch.android.kursweather.Database.WeatherResponse
import com.bignerdranch.android.kursweather.GetWeatherUseCase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/*class WeatherViewModel (application: Application): AndroidViewModel(application) {
    val getWeather: LiveData<List<Weather>>
    private val repository: KursWeatherRepository

    init{
        val kursWeatherDao = KursWeatherDatabase.getDatabase(application).kursWeatherDao()
        repository = KursWeatherRepository(kursWeatherDao)
        getWeather = repository.getWeather
    }

}*/
class WeatherViewModel constructor(private val getWeatherUseCase: GetWeatherUseCase) : ViewModel() {

    val getWeather: LiveData<WeatherResponse>
    //var weatherResponse: MutableLiveData<WeatherResponse> = MutableLiveData()
    val weatherResponse: MutableLiveData<WeatherResponse> = MutableLiveData()
    init {

        GlobalScope.launch{
            weatherResponse.postValue(getWeatherUseCase.invoke(1, "no", "no"))


            //val forecastDayValue = forecastDay.value
            //forecastDay.postValue(forecastDayValue?.get(0))
        }

        //weatherResponse
        getWeather = weatherResponse

    }}

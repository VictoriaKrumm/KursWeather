package com.bignerdranch.android.kursweather

import android.util.Log
import com.bignerdranch.android.kursweather.ViewModel.WeatherViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object LoadParameters {
   /* private var downloader : Job? = null
    private var isExecute : Boolean = false

    fun StartLoadData(mWeatherViewModel : WeatherViewModel){
        if (downloader == null){
            downloader = GlobalScope.launch {
                val weatherClientAPI = WeatherClientAPI()
                weatherClientAPI.getWeatherList(mWeatherViewModel)
                isExecute = true
                delay(2000)
                downloader = null
            }
            Log.d("Debug LoadParam", "END of download")
        }

        /*   downloader = GlobalScope.launch {
               while (true) {
                   val coinGeckoClientAPI = CoinGeckoClientAPI()
                   coinGeckoClientAPI.getCoinList(mCoinViewModel)
                   isExecute = true
                   delay(2000)
               }
           }*/
    }

    suspend fun StopLoadData(){
        if (downloader != null){
            Log.d("Debug LoadParam", "STOP load is invoke")
            downloader!!.cancel()
            downloader!!.join()
            downloader = null
            isExecute = false
        }
    }

    fun GetStatusExecute() : Boolean{
        return isExecute
    }

    fun LoadIsOver(){
        isExecute = false
    }

    */
}
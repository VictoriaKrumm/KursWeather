package com.bignerdranch.android.kursweather.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.kursweather.API.HoursList
import com.bignerdranch.android.kursweather.Database.Forecast
import com.bignerdranch.android.kursweather.Database.ForecastDay
import com.bignerdranch.android.kursweather.Database.WeatherResponse
import com.bignerdranch.android.kursweather.R


class ListAdapter: RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var weatherList = emptyList<HoursList>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val time : TextView = itemView.findViewById(R.id.time)
        val temp_c : TextView = itemView.findViewById(R.id.temp_c)
       // val wind_kph : TextView = itemView.findViewById(R.id.wind_kph)
      //  val humidity : TextView = itemView.findViewById(R.id.humidity)
        val constraintLayout : ConstraintLayout = itemView.findViewById(R.id.constraintLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = weatherList[position]

        holder.time.text = currentItem.time
        holder.temp_c.text = currentItem.temp_c
      //  holder.wind_kph.text = currentItem.wind_kph.toString()
     //   holder.humidity.text = currentItem.humidity.toString()

        holder.constraintLayout.setOnClickListener{
            val action = ListFragmentDirections.actionListFragmentToItemFragment(currentItem)
            holder.itemView.findNavController().navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return weatherList.size
    }
    fun setData(weather : WeatherResponse){
        val forecast = weather.forecast
        val forecastday = forecast?.forecastday?.get(0)
        this.weatherList = forecastday?.hours!!
        notifyDataSetChanged()
    }
}
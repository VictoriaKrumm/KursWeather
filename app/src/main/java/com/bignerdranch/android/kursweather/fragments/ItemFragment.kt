package com.bignerdranch.android.kursweather.fragments

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bignerdranch.android.kursweather.R
import com.bignerdranch.android.kursweather.databinding.FragmentItemBinding
import com.bignerdranch.android.kursweather.databinding.FragmentListBinding

class ItemFragment: Fragment()  {

    private val args by navArgs<ItemFragmentArgs>()
    private lateinit var binding: FragmentItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate((R.layout.fragment_item),container,false)
        val time: TextView= view.findViewById(R.id.timeCurrentItem)
        val temp_c: TextView= view.findViewById(R.id.temp_cCurrentItem)
        val wind_kph: TextView= view.findViewById(R.id.wind_kphCurrentItem)//wind_kph)
        val humidity: TextView= view.findViewById(R.id.humidityCurrentItem)//humidity)
        if (args != null) {

            time.text = args.currentItem.time.toString()
            temp_c.text = args.currentItem.temp_c.toString()
            wind_kph.text = args.currentItem.wind_kph.toString()
            humidity.text = args.currentItem.humidity.toString()
        }
        else {
            time.text = ""
            temp_c.text =""
            wind_kph.text =""
            humidity.text =""
        }


        return view
    }
}
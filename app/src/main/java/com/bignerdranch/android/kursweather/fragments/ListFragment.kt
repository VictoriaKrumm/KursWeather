package com.bignerdranch.android.kursweather.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.kursweather.LoadParameters
import com.bignerdranch.android.kursweather.ViewModel.WeatherViewModel
import com.bignerdranch.android.kursweather.databinding.FragmentListBinding
import kotlinx.coroutines.Job
import org.koin.androidx.viewmodel.ext.android.getViewModel

class ListFragment: Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var mWeatherViewModel: WeatherViewModel
    private lateinit var weatherRecyclerView: RecyclerView
    private lateinit var adapter : ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mWeatherViewModel = getViewModel()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        adapter = ListAdapter()
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(context)
        //mWeatherViewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)
       mWeatherViewModel.getWeather.observe(viewLifecycleOwner, Observer { weather ->
           adapter.setData(weather) })
        binding.floatingActionButton.setOnClickListener {
            UpdateData()
            Log.d("Debug ListFragment", "Click to Update Button")
            /*findNavController().navigate(R.id.action_listFragment_to_loadFragment)*/
        }
        return binding.root
    }

    override fun onResume() {
        Log.d("Debug ListFragment", "On RESUME")
        super.onResume()
    }

    override fun onStart() {
        Log.d("Debug ListFragment", "On START")
        super.onStart()
    }

    fun UpdateData(){
        Log.d("Debug ListFragment", "START update")
        /*update =
        GlobalScope.launch {
            LoadParameters.StartLoadData(mCoinViewModel)
        }*/
        //LoadParameters.StartLoadData(mWeatherViewModel)
        Log.d("Debug ListFragment", "Coroutine START")
        //update.start()
    }
}
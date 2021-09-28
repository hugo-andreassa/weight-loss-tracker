package com.example.android.weightlosstracker.ui.weigthtracker

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.weightlosstracker.R

class WeightTrackerFragment : Fragment() {

    private lateinit var viewModel: WeightTrackerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(WeightTrackerViewModel::class.java)

        TODO("Add binding")

        return inflater.inflate(R.layout.weight_tracker_fragment, container, false)
    }
}
package com.example.android.weightlosstracker.ui.weigthtracker

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.weightlosstracker.R
import com.example.android.weightlosstracker.databinding.WeightTrackerFragmentBinding

class WeightTrackerFragment : Fragment() {

    private lateinit var binding: WeightTrackerFragmentBinding
    private lateinit var viewModel: WeightTrackerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = WeightTrackerFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(WeightTrackerViewModel::class.java)


        return binding.root
    }
}
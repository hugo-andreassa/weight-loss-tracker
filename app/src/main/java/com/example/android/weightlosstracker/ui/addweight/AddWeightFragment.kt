package com.example.android.weightlosstracker.ui.addweight

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.weightlosstracker.R
import com.example.android.weightlosstracker.databinding.AddWeightFragmentBinding

class AddWeightFragment : Fragment() {

    private lateinit var binding: AddWeightFragmentBinding
    private lateinit var viewModel: AddWeightViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AddWeightFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(AddWeightViewModel::class.java)



        return binding.root
    }
}
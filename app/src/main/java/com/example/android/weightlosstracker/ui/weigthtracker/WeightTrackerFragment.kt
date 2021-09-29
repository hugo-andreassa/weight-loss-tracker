package com.example.android.weightlosstracker.ui.weigthtracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.weightlosstracker.databinding.WeightTrackerFragmentBinding
import com.example.android.weightlosstracker.db.getDatabase
import com.example.android.weightlosstracker.models.Weight
import com.example.android.weightlosstracker.ui.weigthtracker.adapters.WeightAdapter

class WeightTrackerFragment : Fragment() {

    private lateinit var binding: WeightTrackerFragmentBinding
    private lateinit var viewModel: WeightTrackerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = WeightTrackerFragmentBinding.inflate(inflater)

        val database = getDatabase(requireContext())
        viewModel = ViewModelProvider(this, WeightTrackerViewModel.Factory(database))
            .get(WeightTrackerViewModel::class.java)

        setupRecyclerView()

        return binding.root
    }

    private fun setupRecyclerView() {
        val adapter = WeightAdapter()
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter.submitList(listOf(Weight(1, 129.4, 0)))
    }
}
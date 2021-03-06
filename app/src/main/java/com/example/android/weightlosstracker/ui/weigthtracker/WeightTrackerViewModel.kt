package com.example.android.weightlosstracker.ui.weigthtracker

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.weightlosstracker.db.AppDatabase

class WeightTrackerViewModel(private val database: AppDatabase) : ViewModel() {



    class Factory(private val database: AppDatabase) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(WeightTrackerViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return WeightTrackerViewModel(database) as T
            }

            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}
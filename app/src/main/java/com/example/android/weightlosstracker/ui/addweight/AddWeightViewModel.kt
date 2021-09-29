package com.example.android.weightlosstracker.ui.addweight

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.weightlosstracker.db.AppDatabase

class AddWeightViewModel(private val database: AppDatabase) : ViewModel() {




    class Factory(private val database: AppDatabase) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(AddWeightViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return AddWeightViewModel(database) as T
            }

            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}
package com.example.android.weightlosstracker.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Weight(
    @PrimaryKey
    var id: Long,
    var weight: Double,
    var date: Long
)
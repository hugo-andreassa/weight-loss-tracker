package com.example.android.weightlosstracker.db

import android.content.Context
import androidx.room.*
import com.example.android.weightlosstracker.models.Weight

@Database(entities = [Weight::class], version = 1, exportSchema = false)
abstract class AppDatabase() : RoomDatabase() {

}

private lateinit var INSTANCE: AppDatabase

fun getDatabase(context: Context): AppDatabase {
    synchronized(AppDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "weightlosstracker"
            ).build()
        }
        return INSTANCE
    }
}

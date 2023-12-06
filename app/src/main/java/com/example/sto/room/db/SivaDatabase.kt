package com.example.sto.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.sto.room.dao.TestDao
import com.example.sto.room.entity.TestEntity

@Database(
    entities = [TestEntity::class],
    version = 1,
    exportSchema = true
)
abstract class SivaDatabase: RoomDatabase()  {
    abstract fun testDao(): TestDao
    companion object {
        @Volatile
        var INSTANCE: SivaDatabase? = null

        fun getDatabase(context: Context): SivaDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.inMemoryDatabaseBuilder(
                    context,
                    SivaDatabase::class.java,
                ).allowMainThreadQueries().build()
                INSTANCE = instance

                return instance
            }

        }
    }
}
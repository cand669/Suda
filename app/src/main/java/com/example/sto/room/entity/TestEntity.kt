package com.example.sto.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "test_table")
data class TestEntity(
    val t:String,
    val ix:Int,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
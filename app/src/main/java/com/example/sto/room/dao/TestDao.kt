package com.example.sto.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.sto.room.entity.TestEntity

@Dao
interface TestDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTest(data: TestEntity)


    @Query("UPDATE test_table SET ix = :ix WHERE t = :t")
    fun u0(t:String,ix:Int)


    @Query("SELECT * FROM test_table")
    fun s0():List<TestEntity>?
}
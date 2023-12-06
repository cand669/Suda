package com.example.suda.room.repository

import android.util.Log
import com.example.suda.room.dao.TestDao
import com.example.suda.room.entity.TestEntity

class TestRepository( val dao: TestDao) {


    fun addTest(t:String,ix:Int) {
        dao.addTest(TestEntity(t,ix))
    }

    fun u0(t:String,ix:Int) {
        dao.u0(t,ix)
    }
    fun s0(){
        dao.s0()?.let {
            it.forEach {
                Log.i("ZSCSA","${it.t} ${it.ix}")
            }
        }
    }
}
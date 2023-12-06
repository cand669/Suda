package com.example.sto.room.repository

import android.util.Log
import com.example.sto.room.dao.TestDao
import com.example.sto.room.entity.TestEntity

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
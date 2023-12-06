package com.example.suda.room.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.suda.room.db.SivaDatabase
import com.example.suda.room.repository.TestRepository

class SivaViewModel(application: Application) : AndroidViewModel(application) {
    private val testrository: TestRepository

    init {
        val testDao = SivaDatabase.getDatabase(application).testDao()
        testrository = TestRepository(testDao)
    }


    fun qm() {
        testrository.addTest("t", 2)

    }

    fun xms() {
        try {
            SivaDatabase.INSTANCE?.runInTransaction {
                testrository.u0("t", 9)
                testrository.u0("t", 8)
                0 / 0
                testrository.u0("t", 12)

            }
        } catch (e: Exception) {
        }
        testrository.s0()
    }
}
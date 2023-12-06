package com.example.sto.activity

import androidx.lifecycle.ViewModelProvider
import com.example.sto.core.BaseActivity
import com.example.sto.databinding.ActivitySivaBinding
import com.example.sto.fragment.DunkFragment
import com.example.sto.fragment.PearFragment
import com.example.sto.room.viewmodel.SivaViewModel
import com.example.sto.widget.NoScrollViewPager
import com.xuexiang.xui.adapter.FragmentAdapter

class SivaActivity : BaseActivity<ActivitySivaBinding>() {

    var vp: NoScrollViewPager? = null
    override fun InitView() {
        vp = binding.vp
    }

    override fun InitListener() {
    }

    val f_dunk = DunkFragment()
    val f_pear = PearFragment()
    override fun InitMain() {
        vp?.adapter = FragmentAdapter(
            supportFragmentManager, listOf(
                f_pear, f_dunk,
            )
        )
        vp?.offscreenPageLimit = 2

    }

    override fun InitData() {
        val vm = ViewModelProvider(this).get(SivaViewModel::class.java)
        vm.qm()
        vm.xms()
    }
}
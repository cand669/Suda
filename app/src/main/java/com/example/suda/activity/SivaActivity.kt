package com.example.suda.activity

import androidx.lifecycle.ViewModelProvider
import com.example.suda.core.BaseActivity
import com.example.suda.databinding.ActivitySivaBinding
import com.example.suda.fragment.DunkFragment
import com.example.suda.fragment.PearFragment
import com.example.suda.room.viewmodel.SivaViewModel
import com.example.suda.widget.NoScrollViewPager
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
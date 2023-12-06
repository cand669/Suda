package com.example.suda.fragment

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.VirtualLayoutManager
import com.alibaba.android.vlayout.layout.ColumnLayoutHelper
import com.alibaba.android.vlayout.layout.GridLayoutHelper
import com.example.suda.adapter.ColumnLayoutAdapter
import com.example.suda.adapter.GridLayoutAdapter
import com.example.suda.core.BaseFragment
import com.example.suda.databinding.FragmentPearBinding

class PearFragment : BaseFragment<FragmentPearBinding>() {
    var rv: RecyclerView? = null
    override fun InitView() {
        rv = binding.rv
    }

    override fun InitListener() {
    }

    override fun InitMain() {
        val context = requireContext()
        val manager = VirtualLayoutManager(context)
        rv?.layoutManager = manager
        val viewPool = RecyclerView.RecycledViewPool()
        rv?.setRecycledViewPool(viewPool)
        viewPool.setMaxRecycledViews(0, 10)
        val adapter = DelegateAdapter(manager)
        adapter?.addAdapter(initColumnLayout(context))
        adapter?.addAdapter(initGridLayoutAdapter(context))
        rv?.setAdapter(adapter)
    }

    fun initColumnLayout(context: Context): ColumnLayoutAdapter {
        val columnLayoutHelper = ColumnLayoutHelper()
        columnLayoutHelper.setWeights(floatArrayOf(20f, 20f, 20f, 20f, 20f))
        columnLayoutHelper.marginBottom = 20
        return ColumnLayoutAdapter(context, columnLayoutHelper)
    }

    fun initGridLayoutAdapter(context: Context): GridLayoutAdapter {
        val gridLayoutHelper = GridLayoutHelper(4)
        gridLayoutHelper.setSpanSizeLookup(object : GridLayoutHelper.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return 2
            }
        })
        gridLayoutHelper.setAutoExpand(false)
        return GridLayoutAdapter(context, gridLayoutHelper)
    }

    override fun InitData() {

    }

}
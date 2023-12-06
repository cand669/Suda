package com.example.suda.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.suda.adapter.SimpRecyclerViewAdapter
import com.example.suda.core.BaseFragment
import com.example.suda.databinding.FragmentDunkBinding

class DunkFragment : BaseFragment<FragmentDunkBinding>() {

    var rv:RecyclerView? = null
    override fun InitView() {
        rv = binding.rv
    }

    override fun InitListener() {
    }

    override fun InitMain() {
        val manager = LinearLayoutManager(requireContext())
        manager.orientation = LinearLayoutManager.VERTICAL
        rv?.layoutManager = manager
        rv?.adapter = SimpRecyclerViewAdapter(listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n"))

    }

    override fun InitData() {

    }

}
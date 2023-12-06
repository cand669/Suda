package com.example.sto.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sto.adapter.SimpRecyclerViewAdapter
import com.example.sto.core.BaseFragment
import com.example.sto.databinding.FragmentDunkBinding

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
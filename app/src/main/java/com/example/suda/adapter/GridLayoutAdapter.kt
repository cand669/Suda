package com.example.suda.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.LayoutHelper
import com.example.suda.databinding.ItemSimpBinding

class GridLayoutAdapter(
    val context: Context,
    val helper: LayoutHelper,
) : DelegateAdapter.Adapter<GridLayoutAdapter.DelegateRecyclerHolder>() {

    inner class DelegateRecyclerHolder(val binding: ItemSimpBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DelegateRecyclerHolder {
        val binding = ItemSimpBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return DelegateRecyclerHolder(binding)
    }

    val mlist = listOf("a", "b", "c", "d", "e")
    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onCreateLayoutHelper(): LayoutHelper {
        return helper
    }

    override fun onBindViewHolder(holder: DelegateRecyclerHolder, position: Int) {
        val item = mlist[position]
        with(holder) {
            binding.but.text = item
        }
    }
}
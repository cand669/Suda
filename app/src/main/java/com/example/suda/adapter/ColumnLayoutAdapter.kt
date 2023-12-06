package com.example.suda.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.android.vlayout.DelegateAdapter
import com.alibaba.android.vlayout.LayoutHelper
import com.example.suda.databinding.ItemColBinding

class ColumnLayoutAdapter(
    val context: Context,
    val helper: LayoutHelper,
) : DelegateAdapter.Adapter<ColumnLayoutAdapter.ColumnLayoutHolder>() {
    private val inflater: LayoutInflater

    val mlist = listOf("a", "b", "c", "d", "e")

    init {
        inflater = LayoutInflater.from(context)
    }

    inner class ColumnLayoutHolder(val binding: ItemColBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColumnLayoutHolder {
        val binding = ItemColBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ColumnLayoutHolder(binding)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onCreateLayoutHelper(): LayoutHelper {
        return helper
    }

    override fun onBindViewHolder(holder: ColumnLayoutHolder, position: Int) {
        val item = mlist[position]
        with (holder) {
            binding.but.text = item
        }
    }
}
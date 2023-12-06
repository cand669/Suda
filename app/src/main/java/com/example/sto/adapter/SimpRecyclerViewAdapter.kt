package com.example.sto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sto.databinding.ItemSimpBinding

class SimpRecyclerViewAdapter<T>(var mlist: List<T>) :
    RecyclerView.Adapter<SimpRecyclerViewAdapter<T>.SimpRecyclerViewHolder>() {
    private var onItemClickListener: OnItemClickListener<T>? = null
    fun setOnItemClickListener(listener: OnItemClickListener<T>) {
        this.onItemClickListener = listener
    }

    interface OnItemClickListener<T> {
        fun onItemClick(item: T)
        fun onItemLongClick(position: Int): Boolean
    }


    inner class SimpRecyclerViewHolder(val binding: ItemSimpBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                onItemClickListener?.onItemClick(mlist.get(adapterPosition))

            }
            itemView.setOnLongClickListener {
                onItemClickListener?.onItemLongClick(adapterPosition) ?: false
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpRecyclerViewHolder {
        val binding = ItemSimpBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return SimpRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    override fun onBindViewHolder(holder: SimpRecyclerViewHolder, position: Int) {
        val model = mlist.get(position)
        with(holder) {
            binding.but.text = model.toString()
        }
    }
}
package com.example.android.weightlosstracker.ui.weigthtracker.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.weightlosstracker.databinding.WeigthListItemBinding
import com.example.android.weightlosstracker.models.Weight

class WeightAdapter : ListAdapter<Weight, WeightViewHolder>(DiffUtilCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeightViewHolder {
        return WeightViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: WeightViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

class WeightViewHolder(private val binding: WeigthListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Weight) {
        binding.weight = item
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): WeightViewHolder {
            val context = parent.context
            val inflater = LayoutInflater.from(context)
            return WeightViewHolder(WeigthListItemBinding.inflate(inflater, null, false))
        }
    }
}

class DiffUtilCallback : DiffUtil.ItemCallback<Weight>() {
    override fun areItemsTheSame(oldItem: Weight, newItem: Weight): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Weight, newItem: Weight): Boolean {
        return oldItem == newItem
    }

}
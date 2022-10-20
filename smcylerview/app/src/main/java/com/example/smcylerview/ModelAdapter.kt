package com.example.smcylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding

class ModelAdapter(val ModelList: List<Model>) :
    RecyclerView.Adapter<ModelAdapter.ViewHolder>() {

    inner class ViewHolder(
        val binding: ActivityRvItemSingerBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: Model) {
            Glide.with(binding.image.context)
                .load(model.image)
                .into(binding.image)
            binding.name.text = model.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ActivityRvItemSingerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend3 = ModelList[position]
        holder.bind(friend3)
    }

    override fun getItemCount(): Int {
        return ModelList.size
    }
}
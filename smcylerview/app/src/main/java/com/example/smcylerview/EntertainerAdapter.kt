package com.example.smcylerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding

class EntertainerAdapter(val EnterList: List<Enter>):
        RecyclerView.Adapter<EntertainerAdapter.ViewHolder>(){
            inner class ViewHolder(
                val binding: ActivityRvItemSingerBinding
            ) : RecyclerView.ViewHolder(binding.root){
                fun bind(enter : Enter){
                    Glide.with(binding.image.context)
                        .load(enter.image)
                        .into(binding.image)
                    binding.name.text = enter.name

                    binding.infoLayout.setOnClickListener{

                        val intent = Intent(binding.infoLayout.context,Enterinfo::class.java)
                        intent.putExtra("image",enter.image)
                        intent.putExtra("name",enter.korname)
                        intent.putExtra("birth",enter.birth)
                        intent.putExtra("debut",enter.debut)
                        intent.putExtra("company",enter.company)
                        binding.infoLayout.context.startActivity(intent)
                    }
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ActivityRvItemSingerBinding.inflate(
                LayoutInflater.from(parent.context), parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return EnterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val friend1 = EnterList[position]
        holder.bind(friend1)
    }
}
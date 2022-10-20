package com.example.smcylerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityArtistinfoBinding
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding

class SingerAdapter(val SingerList: List<Singer>) :
    RecyclerView.Adapter<SingerAdapter.ViewHolder>() {
    inner class ViewHolder(
        val binding: ActivityRvItemSingerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(singer: Singer) {
            Glide.with(binding.image.context)
                .load(singer.image)
                .into(binding.image)
            binding.name.text = singer.name

            binding.infoLayout.setOnClickListener {
                val intent = Intent(binding.infoLayout.context, ArtistinfoActivity::class.java)
                intent.putExtra("image",singer.image)
                intent.putExtra("name",singer.korname)
                intent.putExtra("info",singer.info)
                intent.putExtra("birth",singer.birth)
                intent.putExtra("debut",singer.debut)
                binding.infoLayout.context.startActivity(intent)

            }

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
            val friend = SingerList[position]
            holder.bind(friend)

        }

        override fun getItemCount(): Int {
            return SingerList.size
        }

    }


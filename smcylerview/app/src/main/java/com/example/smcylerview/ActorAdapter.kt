package com.example.smcylerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityMainBinding
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding

class ActorAdapter(val ActorList: List<Actor>) :
    RecyclerView.Adapter<ActorAdapter.ViewHolder>() {

    inner class ViewHolder(
        val binding: ActivityRvItemSingerBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(actor: Actor) {
            Glide.with(binding.image.context)
                .load(actor.image)
                .into(binding.image)
            binding.name.text = actor.name

            binding.infoLayout.setOnClickListener {
                val intent = Intent(binding.infoLayout.context,Actorinfo::class.java)
                intent.putExtra("image",actor.image)
                intent.putExtra("name",actor.korname)
                intent.putExtra("info",actor.info)
                intent.putExtra("birth",actor.birth)
                intent.putExtra("debut",actor.debut)
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
        val friend2 = ActorList[position]
        holder.bind(friend2)
    }

    override fun getItemCount(): Int {
        return ActorList.size
    }
}
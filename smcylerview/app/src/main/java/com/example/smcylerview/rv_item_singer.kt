package com.example.smcylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smcylerview.databinding.ActivityRvItemSingerBinding

class rv_item_singer : AppCompatActivity() {
    private lateinit var binding2 : ActivityRvItemSingerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityRvItemSingerBinding.inflate(layoutInflater)

    }
}
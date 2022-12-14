package com.example.smcylerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.smcylerview.databinding.ActivityArtistinfoBinding


class ArtistinfoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityArtistinfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArtistinfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this)
            .load("data:image/png;base64,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")
            .into(binding.smlogo)

        Glide.with(this)
            .load("https://www.smentertainment.com/Images/pageVisual/top_album_banner_0.jpg")
            .into(binding.banner)
        val image = intent.getStringExtra("image")
        val name = intent.getStringExtra("name")
        val info = intent.getStringExtra("info")
        val birth = intent.getStringExtra("birth")
        val debut = intent.getStringExtra("debut")

        Glide.with(binding.image.context)
            .load(image)
            .into(binding.image)

        if(birth == ""){
            binding.birth1.setText("")
        }
        else{
            binding.birth.text = birth
        }
        binding.name.text = name
        binding.info.text = info

        if(debut == ""){
            binding.debut1.setText("")
        }
        else{
            binding.debut.text = debut
        }

        // Adapter??? ??????????????? ?????? ????????? ?????? ArrayList<Int> ??????
        val albumList = listOf<Album>(
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","1","11"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","2","22"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","3","33"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","4","44"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","5","55"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","6","66"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","7","77"),
            Album("https://smtown-cdn.smtown.com/upload/profile/web-detail/37a110897bd843efab45acdacf99d6dd_2022-02-17-05-13-03.jpg","8","88")
        )
//        val adapter = frameAdapter(albumList)
//        binding.viewpager.adapter = adapter

    }
}
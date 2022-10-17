package com.commscope.codingchallengekt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.commscope.codingchallengekt.databinding.ActivityImageBinding
import com.commscope.codingchallengekt.databinding.ActivityMainBinding

class ImageActivity : AppCompatActivity() {
    val IMAGE_URL = "https://i.imgur.com/DvpvklR.png"
    private val binding by lazy { ActivityImageBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Picasso"
        Glide.with(binding.root.context).load(IMAGE_URL)
            .into(binding.imageView)
    }
}
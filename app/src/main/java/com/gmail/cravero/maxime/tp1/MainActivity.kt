package com.gmail.cravero.maxime.tp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide



class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.image_view)
        button = findViewById(R.id.myButton)
        button.setOnClickListener(this)
        //loadImage()
    }
//    private fun loadImage() {
//        Glide.with(this)
//            .load(url)
//            .fallback(R.drawable.ic_launcher_background)
//            .into(imageView)
//    }
    override fun onClick(view: View?) {
        Toast.makeText(this, "You click me", Toast.LENGTH_LONG).show()
    }

//      Glide.with(activity = this)
//            .load(string="url")
//            .fallback(R.drawable.ic_launcher_background)
//            .into(imageView)
}


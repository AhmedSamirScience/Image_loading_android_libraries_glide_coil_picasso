package com.task.image_loading

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var glideBTN : Button
    lateinit var coilBTN : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        glideBTN = findViewById(R.id.glide)
        coilBTN = findViewById(R.id.coil)

        glideBTN.setOnClickListener(this)
        coilBTN.setOnClickListener(this)

    }

    @SuppressLint("CheckResult")
    override fun onClick(p0: View?) {
        when (p0)
        {
            glideBTN ->{
                val intent = Intent(this, GlideActivity::class.java)
                startActivity(intent)
            }
            coilBTN ->{
                val intent = Intent(this, CoilActivity::class.java)
                startActivity(intent)
            }

        }
    }

}
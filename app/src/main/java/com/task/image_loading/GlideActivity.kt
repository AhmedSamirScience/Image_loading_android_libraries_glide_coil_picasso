package com.task.image_loading

import android.annotation.SuppressLint
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

class GlideActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var override_btn : Button
    lateinit var circleImage_btn : Button
    lateinit var errorWithURL_btn : Button
    lateinit var successWithUrl_btn : Button
    lateinit var successWithLoading_btn : Button

    lateinit var glideImageView : ImageView

    lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        glideImageView = findViewById(R.id.image)
        override_btn = findViewById(R.id.override_btn)
        circleImage_btn = findViewById(R.id.circleImage_btn)
        errorWithURL_btn = findViewById(R.id.errorWithURL_btn)
        successWithUrl_btn = findViewById(R.id.successWithUrl_btn)
        successWithLoading_btn = findViewById(R.id.successWithLoadingListener_btn)

        progressBar = findViewById(R.id.progressBar)

        override_btn.setOnClickListener(this)
        circleImage_btn.setOnClickListener(this)
        errorWithURL_btn.setOnClickListener(this)
        successWithUrl_btn.setOnClickListener(this)
        successWithLoading_btn.setOnClickListener(this)
    }

    @SuppressLint("CheckResult")
    override fun onClick(p0: View?) {
        when (p0)
        {
            successWithUrl_btn ->{
                Glide.with(applicationContext)
                    .load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .placeholder(R.drawable.ic_loading) //displaying ic_loading until url image loaded
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // used to cache images
                    .error(R.drawable.ic_error)
                    .into(glideImageView)
            }
            successWithLoading_btn ->{
                progressBar.visibility = View.VISIBLE
                Glide.with(applicationContext)
                    .load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .listener(object: RequestListener<Drawable> {
                        override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }
                        override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }
                    })
                    .error(R.drawable.ic_error)
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // used to cache images
                    .into(glideImageView)

            }
            errorWithURL_btn ->{
                Glide.with(applicationContext)
                    .load("aahttps://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .placeholder(R.drawable.ic_loading) //displaying ic_loading until url image loaded
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // used to cache images
                    .error(R.drawable.ic_error)
                    .into(glideImageView)
            }
            circleImage_btn ->{
                Glide.with(applicationContext)
                    .load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .placeholder(R.drawable.ic_loading) //displaying ic_loading until url image loaded
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // used to cache images
                    .circleCrop()
                    .error(R.drawable.ic_error)
                    .into(glideImageView)
            }
            override_btn-> {
                Glide.with(applicationContext)
                    .load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .override(100,100) //used when you need a very specific image size.
                    .placeholder(R.drawable.ic_loading) //displaying ic_loading until url image loaded
                    .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC) // used to cache images
                    .error(R.drawable.ic_error)
                    .into(glideImageView)
            }
        }
    }

}
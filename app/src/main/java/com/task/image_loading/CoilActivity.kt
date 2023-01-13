package com.task.image_loading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import coil.imageLoader
import coil.load
import coil.request.CachePolicy
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation


class CoilActivity : AppCompatActivity(), View.OnClickListener {

    //TODO coil URL OF GITHUB REGION
    //region REGION
    // https://coil-kt.github.io/coil/
    //endregion

    lateinit var roundedCornersTransformation_btn : Button
    lateinit var circleImage_btn : Button
    lateinit var errorWithURL_btn : Button
    lateinit var successWithUrl_btn : Button
    lateinit var successWithLoading_btn : Button

    lateinit var coilImageView : ImageView

    lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coil)

        coilImageView = findViewById(R.id.image)
        roundedCornersTransformation_btn = findViewById(R.id.roundedCornersTransformation_btn)
        circleImage_btn = findViewById(R.id.circleImage_btn)
        errorWithURL_btn = findViewById(R.id.errorWithURL_btn)
        successWithUrl_btn = findViewById(R.id.successWithUrl_btn)
        successWithLoading_btn = findViewById(R.id.successWithLoadingListener_btn)

        progressBar = findViewById(R.id.progressBar)

        roundedCornersTransformation_btn.setOnClickListener(this)
        circleImage_btn.setOnClickListener(this)
        errorWithURL_btn.setOnClickListener(this)
        successWithUrl_btn.setOnClickListener(this)
        successWithLoading_btn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0)
        {
            successWithUrl_btn ->{
                coilImageView.load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg") {
                    placeholder(R.drawable.ic_loading)
                    error(R.drawable.ic_error)
                    memoryCachePolicy(CachePolicy.ENABLED)
                    crossfade(true)
                    crossfade(1000)
                }
            }
            successWithLoading_btn ->{
                val request = ImageRequest.Builder(applicationContext)
                    .data("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg")
                    .error(R.drawable.ic_error)
                    .memoryCachePolicy(CachePolicy.ENABLED)
                    .target(
                        onStart = {placeholder ->  
                            progressBar.visibility = View.VISIBLE
                        },
                        onSuccess = {result ->
                            progressBar.visibility = View.GONE
                            coilImageView.setImageDrawable(result)
                        },
                        onError = {
                            progressBar.visibility = View.GONE
                        }
                    ).build()
                    applicationContext.imageLoader.enqueue( request=request)
            }
            errorWithURL_btn ->{
                coilImageView.load("error https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg") {
                    placeholder(R.drawable.ic_loading)
                    error(R.drawable.ic_error)
                    memoryCachePolicy(CachePolicy.ENABLED)
                    crossfade(true)
                    crossfade(1000)
                }
            }
            circleImage_btn ->{
                coilImageView.load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg") {
                    placeholder(R.drawable.ic_loading)
                    error(R.drawable.ic_error)
                    memoryCachePolicy(CachePolicy.ENABLED)
                    crossfade(true)
                    crossfade(1000)
                    transformations(CircleCropTransformation())
                }
            }
            roundedCornersTransformation_btn-> {
                coilImageView.load("https://i2.wp.com/beebom.com/wp-content/uploads/2016/01/Reverse-Image-Search-Engines-Apps-And-Its-Uses-2016.jpg") {
                    placeholder(R.drawable.ic_loading)
                    error(R.drawable.ic_error)
                    memoryCachePolicy(CachePolicy.ENABLED)
                    crossfade(true)
                    crossfade(1000)
                    transformations(RoundedCornersTransformation(10f))
                }
            }
        }
    }

}
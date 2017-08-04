package com.development.rayout.menuichi

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_appetizer_subcat.*


class AppetizerSubcatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appetizer_subcat)

        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.ristretto)
        VideoBannertop.setVideoURI(uri)
        VideoBannertop.start()
        VideoBannertop.setOnPreparedListener { mp -> mp.isLooping = true }
    }
}

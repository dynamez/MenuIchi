package com.development.rayout.menuichi

import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_menu_principal.*

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
       // val videoview = findViewById<View>(R.id.videoView) as VideoView
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.ristretto)
        videoView.setVideoURI(uri)
        videoView.start()
        videoView.setOnPreparedListener { mp -> mp.isLooping = true }

    }
}

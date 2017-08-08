package com.development.rayout.menuichi

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_principal.*

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
       // val videoview = findViewById<View>(R.id.videoView) as VideoView
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.cest_chaud)
        videoView.setVideoURI(uri)
        videoView.start()
        videoView.setOnPreparedListener { mp -> mp.isLooping = true }

        cv.setOnClickListener { val mainIntent = Intent(this, ProductListActivity::class.java)
            startActivity(mainIntent)
             }
        sushibar_card.setOnClickListener { val mainIntent = Intent(this, SushiSubcatActivity::class.java)
            startActivity(mainIntent)
        }
        postres_card.setOnClickListener { val mainIntent = Intent(this, AppetizerSubcatActivity::class.java)
            startActivity(mainIntent)
        }
        especialidades_card.setOnClickListener { val mainIntent = Intent(this, AppetizerSubcatActivity::class.java)
            startActivity(mainIntent)
        }
        bar_card.setOnClickListener { val mainIntent = Intent(this, AppetizerSubcatActivity::class.java)
            startActivity(mainIntent)
        }
        eventos_card.setOnClickListener { val mainIntent = Intent(this, AppetizerSubcatActivity::class.java)
            startActivity(mainIntent)
        }

    }

    override fun onResume() {
        super.onResume()
        videoView.start()
        videoView.setOnPreparedListener { mp -> mp.isLooping = true }
    }
}

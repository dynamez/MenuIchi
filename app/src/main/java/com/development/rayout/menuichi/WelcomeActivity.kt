package com.development.rayout.menuichi

import android.app.Activity
import android.content.Intent
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_menu_principal.*
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : Activity() {

    //private val continuar by bindView(R.id.continuar_id)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        continuar_id.setOnClickListener { val mainIntent = Intent(this, MenuPrincipalActivity::class.java)
            startActivity(mainIntent)
            finish() }




    }
}

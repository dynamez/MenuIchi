package com.development.rayout.menuichi

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log

import kotlinx.android.synthetic.main.activity_product_list.*
import java.util.ArrayList

class ProductListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.cest_chaud)
        videoView2.setVideoURI(uri)
        videoView2.start()
        videoView2.setOnPreparedListener { mp -> mp.isLooping = true }

        //rv = findViewById(R.id.recyclerid) as RecyclerView
        val llm = LinearLayoutManager(this)
        rv.layoutManager=llm
        rv.setHasFixedSize(true)
        Log.e("test", "test")

        val lista = ModeloLista("Sushi", "$ 9.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista3 = ModeloLista("Sashimi", "$ 7.500", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista4 = ModeloLista("Hosomaki", "$ 8.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista5 = ModeloLista("Ramen", "$ 12.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista6 = ModeloLista("Onigiri", "$ 10.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista2 = ArrayList<ModeloLista>()
        lista2.add(lista)
        lista2.add(lista3)
        lista2.add(lista4)
        lista2.add(lista5)
        lista2.add(lista6)
        val adapter2 = ProductListAdapter(lista2)
        rv.adapter = adapter2
        val recyclerViewState: Parcelable
        recyclerViewState = rv.getLayoutManager().onSaveInstanceState()
        rv.getLayoutManager().onRestoreInstanceState(recyclerViewState)
    }
}

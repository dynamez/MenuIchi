package com.development.rayout.menuichi

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


        //rv = findViewById(R.id.recyclerid) as RecyclerView
        val llm = LinearLayoutManager(this)
        rv.layoutManager=llm
        rv.setHasFixedSize(true)
        Log.e("test", "test")

        val lista = ModeloLista("Sushi", "$ 9.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista3 = ModeloLista("Sashimi", "$ 9.000", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, \\rsed do eiusmod\\r tempor incididunt ut labore \\ret dolore magna aliqua. Ut")
        val lista2 = ArrayList<ModeloLista>()
        lista2.add(lista)
        lista2.add(lista3)
        val adapter2 = ProductListAdapter(lista2, this)
        rv.adapter = adapter2
        val recyclerViewState: Parcelable
        recyclerViewState = rv.getLayoutManager().onSaveInstanceState()
        rv.getLayoutManager().onRestoreInstanceState(recyclerViewState)
    }
}

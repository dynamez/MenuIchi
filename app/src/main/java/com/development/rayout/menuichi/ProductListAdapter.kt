package com.development.rayout.menuichi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_producto.view.*

class ProductListAdapter(val userList: ArrayList<ModeloLista>) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductListAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_producto, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ProductListAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: ModeloLista) {
            itemView.nombre.text=user.name
            itemView.descripcion.text=user.descripcion
            itemView.precio.text = user.precio

        }
    }

}
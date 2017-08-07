package com.development.rayout.menuichi

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.RelativeLayout
import android.widget.TextView

/**
 * Created by dynam on 06-08-2017.
 */

class ProductListAdapter internal constructor(internal var lista: List<ModeloLista>, internal var activity: Activity) : RecyclerView.Adapter<ProductListAdapter.menuViewHolder>() {
    init {
        inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }


    override fun onAttachedToRecyclerView(recyclerView: RecyclerView?) {
        super.onAttachedToRecyclerView(recyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): menuViewHolder {
        val v = LayoutInflater
                .from(parent.context).inflate(R.layout.card_producto, parent, false)
        val pvh = menuViewHolder(v)
        return pvh
    }

    override fun onBindViewHolder(holder: menuViewHolder, position: Int) {
        holder.name.setText(lista[position].name)
        holder.precio.setText(lista[position].precio)
        holder.descripcion.setText(lista[position].descripcion)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    inner class menuViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var cv: CardView
        internal var precio: TextView
        internal var descripcion: TextView
        internal var name: TextView
        internal var btn_agregar: Button
        internal var btn_detalle: Button

        internal var detalle: ImageView? = null
        internal var barralateral: ImageView? = null
        internal var info: RelativeLayout? = null
        //LatLng loc;

        private val onClickListener = View.OnClickListener { v ->
            val extras = Bundle()
            when (v.id) {
                R.id.agregar -> println("Funciona " + adapterPosition)
                R.id.detalle -> {

                    val pos: Int?
                    pos = v.tag as Int
                    //showPopup(v);
                    println("Funciona " + adapterPosition)
                }


                else -> {
                }
            }//Toast.makeText(v.getContext(), "Clicked on position: " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            // a.startActivity(new Intent(a, MapaDetalleDescuento2.class).putExtras(extras));
            //Toast.makeText(v.getContext(), "Clicked on position: " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            //a.startActivity(new Intent(a, DetalleDescuentoActivity.class).putExtras(extras));
            //VerDetalle();
            //Toast.makeText(v.getContext(), "Clicked on position: " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
            // buscar.clearFocus();
        }


        init {
            cv = itemView.findViewById<View>(R.id.cv) as CardView
            name = itemView.findViewById<View>(R.id.nombre) as TextView
            btn_detalle = itemView.findViewById<View>(R.id.detalle) as Button
            descripcion = itemView.findViewById<View>(R.id.description) as TextView
            btn_agregar = itemView.findViewById<View>(R.id.agregar) as Button
            precio = itemView.findViewById<View>(R.id.precio) as TextView

            //itemView.setOnClickListener(onClickListener);
            btn_detalle.setOnClickListener(onClickListener)
            btn_agregar.setOnClickListener(onClickListener)
        }
        //

    }

    companion object {
        private var inflater: LayoutInflater? = null
    }
}
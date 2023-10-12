package com.example.adminapp.Adpater

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adminapp.R
import com.example.adminapp.interfaces.Onclicklistener
import com.example.adminapp.models.GastoModel


class GastosAdapter (var listGatos:MutableList<GastoModel>,  private var listener: Onclicklistener):RecyclerView.Adapter<GastosAdapter.ViewHolder>(){
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GastosAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gasto,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: GastosAdapter.ViewHolder, position: Int) {
       Log.e("Posicion:", position.toString());
    }

    override fun getItemCount(): Int = listGatos.size


}
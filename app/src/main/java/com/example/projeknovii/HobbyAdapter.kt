package com.example.projeknovii

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbyAdapter( private val  list:  ArrayList<HobbyData>):
    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>(){

    class HobbyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nama = itemView.findViewById<TextView>(R.id.namahobby)
        val desc = itemView.findViewById<TextView>(R.id.deschobby)

        fun bind(get: HobbyData){
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyAdapter.HobbyViewHolder {
        return HobbyAdapter.HobbyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_hobby, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HobbyAdapter.HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size
    }


}



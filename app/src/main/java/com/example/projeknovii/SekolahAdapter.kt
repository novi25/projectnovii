package com.example.projeknovii

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SekolahAdapter(private  val list:ArrayList<Sekolahdata>):
        RecyclerView.Adapter<SekolahAdapter.SekolahViewHolder>(){


    class SekolahViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nama = itemView.findViewById<TextView>(R.id.namasekolah)
        val alamat= itemView.findViewById<TextView>(R.id.alamatsekolah)

        fun bind(get: Sekolahdata){
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SekolahViewHolder {
        return SekolahViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah, parent, false))
    }

    override fun onBindViewHolder(holder: SekolahViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
       return  list.size
    }
}
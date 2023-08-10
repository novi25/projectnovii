package com.example.projeknovii

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProjectAdapter(private val list:ArrayList<projectdata>):
    RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>(){

    class ProjectViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val judul = itemView.findViewById<TextView>(R.id.Judul_project)
        private val desc = itemView.findViewById<TextView>(R.id.descProject)
        private val panah = itemView.findViewById<ImageView>(R.id.Linkproject)

        fun bind(get: projectdata) {
            judul.text = get.judul
            desc.text = get.desc

            panah.setOnClickListener{
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(intent)
            }
        }

    }





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        return ProjectViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_projek, parent, false))
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

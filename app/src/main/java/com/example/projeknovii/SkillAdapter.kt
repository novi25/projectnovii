package com.example.projeknovii

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillAdapter(private  val list: ArrayList<SkillData>):
    RecyclerView.Adapter<SkillAdapter.SkillViewHolder>(){

    class SkillViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nama = itemView.findViewById<TextView>(R.id.namaSkill)
        val desc = itemView.findViewById<TextView>(R.id.descSkill)

        fun bind(get: SkillData){
            nama.text = get.nama
            desc.text = get.desc
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillAdapter.SkillViewHolder {
        return SkillAdapter.SkillViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_skil, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SkillAdapter.SkillViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return  list.size
    }


}
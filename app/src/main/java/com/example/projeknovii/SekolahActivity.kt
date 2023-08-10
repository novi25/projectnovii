package com.example.projeknovii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {

    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<Sekolahdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(Sekolahdata("SD 4 sriwulan","Jl.pondok raden patah"))
        list.add(Sekolahdata("SMP N 1 sayung","Jl.purwosari sayung demak"))
        list.add(Sekolahdata("SMK N 1 sayung","Jl.raya semarang demak"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}
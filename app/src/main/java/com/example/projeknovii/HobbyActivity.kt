package com.example.projeknovii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbyActivity : AppCompatActivity() {

    lateinit var  hobbyView: RecyclerView
    lateinit var  hobbyAdapter: HobbyAdapter
    val list = ArrayList<HobbyData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvHobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        list.add(HobbyData("ridhoo","lari"))
        list.add(HobbyData("PHP","Pemograman Web"))

        hobbyAdapter = HobbyAdapter(list)
        hobbyView.adapter = hobbyAdapter

    }
}
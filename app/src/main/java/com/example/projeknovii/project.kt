package com.example.projeknovii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class project : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<projectdata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(
            projectdata("Pendaftaran siswa",
                "Aplikasi Pendaftaran siswa", "https://github.com/novi25/teacher-profil-app")
        )

        list.add(
            projectdata("Hotel", "Ujian A ",
                "https://github.com/novi25/Ujian A")
        )

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter
    }
}
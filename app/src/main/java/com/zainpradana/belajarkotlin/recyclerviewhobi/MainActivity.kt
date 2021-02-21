package com.zainpradana.belajarkotlin.recyclerviewhobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvHobby: RecyclerView
    lateinit var adapterHobby: HobbyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHobby = findViewById(R.id.recyclerView)
        rvHobby.layoutManager = LinearLayoutManager(this)

        adapterHobby = HobbyAdapter(this, DataDummy.typeHobby)
        rvHobby.adapter = adapterHobby
    }
}
package com.example.kebunku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainPemberitahuan() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pemberitahuanList = listOf<Pemberitahuan>(

            Pemberitahuan(
                R.drawable.broccoli,
                "Brocolli",
                "Indoor"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_plants)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ListPemberitahuanAdapter(this, pemberitahuanList){

        }
    }
}












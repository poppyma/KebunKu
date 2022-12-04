package com.example.kebunku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private lateinit var tvNama: TextView
    private lateinit var tvJenis: TextView
    private lateinit var tvDeskripsi: TextView
    private lateinit var tvKategori: TextView
    private lateinit var imageView: ImageView
    private lateinit var imageViewEdit: ImageView
    private lateinit var imageViewDelete: ImageView
    private lateinit var imageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_tanaman)

        tvNama = findViewById(R.id.tv_nama)
        tvJenis = findViewById(R.id.tv_jenis)
        tvDeskripsi = findViewById(R.id.tv_deskripsi)
        tvKategori = findViewById(R.id.tv_kategori)
        imageView = findViewById(R.id.iv_image_plant2)
        imageViewEdit = findViewById(R.id.iv_edit)
        imageViewDelete = findViewById(R.id.iv_delete)
        imageButton = findViewById(R.id.imageButton)

        val nama = intent.getStringExtra("Nama")
        val jenis = intent.getStringExtra("Jenis Tanaman")
        val deskripsi = intent.getStringExtra("Deskripsi")
        val kategori = intent.getStringExtra("Kategori")
        // val gambar = intent.getIntExtra("Gambar")

        tvNama.text = nama
        tvJenis.text = jenis
        tvDeskripsi.text = deskripsi
        tvKategori.text = kategori
        //  imageView.setImageResource(gambar)

        imageViewEdit.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }

//        imageButton.setOnClickListener {
//            val intent = Intent(this, EditActivity::class.java)
//            startActivity(intent)
//        }

//        imageViewDelete.setOnClickListener {
//
//        }
    }
}
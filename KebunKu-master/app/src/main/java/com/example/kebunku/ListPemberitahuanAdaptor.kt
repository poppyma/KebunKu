package com.example.kebunku

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListPemberitahuanAdapter(private val context: Context, private val pemberitahuan: List<Pemberitahuan>, val listener: (Pemberitahuan) -> Unit) :
    RecyclerView.Adapter<ListPemberitahuanAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_plant)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

        fun bind(pemberitahuan:Pemberitahuan, listener: (Pemberitahuan) -> Unit) {
            imgPhoto.setImageResource(pemberitahuan.photo)
            tvName.text = pemberitahuan.name
            tvDescription.text = pemberitahuan.description

            imgPhoto.setOnClickListener {
                Toast.makeText(
                    imgPhoto.context,
                    "Kamu memilih ${pemberitahuan.name}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        return ListViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pemberitahuan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(pemberitahuan[position], listener)
    }
    override fun getItemCount(): Int = pemberitahuan.size
}




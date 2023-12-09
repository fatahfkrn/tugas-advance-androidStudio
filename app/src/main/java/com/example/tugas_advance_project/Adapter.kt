package com.example.tugas_advance_project

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private val Context, private  val jurusan: List<Jurusan>, val Listener:(Jurusan) -> Unit)
               : RecyclerView.Adapter<Adapter.JurusanViewHolder>() {

            class JurusanViewHolder(view: View):RecyclerView.ViewHolder(view){

                val imgJurusan = view.findViewById<ImageView>(R.id.img_item_photo)
                val nameJurusan = view.findViewById<TextView>(R.id.tv_item_name)
                val descJurusan = view.findViewById<TextView>(R.id.tv_item_deskripsi)




                fun bindView(jurusan: Jurusan, Listener: (Jurusan) -> Unit){
                    imgJurusan.setImageResource(jurusan.imgJurusan)
                    nameJurusan.text = jurusan.nameJurusan
                    descJurusan.text = jurusan.descJurusan

                    itemView.setOnClickListener {
                        (listener(jurusan))
                    }
                }

                private fun listener(jurusan: Jurusan) {
                    TODO("Not yet implemented")
                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JurusanViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: JurusanViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}
package com.example.tugas_advance_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTEN_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jurusanlist = listOf<Jurusan>(
            Jurusan(
                R.drawable.profile_picture,
                nameJurusan = "Sistem Informasi",
                descJurusan = "Salah satu jurasan yang unggul dalam bidang analisis."
            ),
            Jurusan(
                R.drawable.profile_picture,
                nameJurusan = "Bisnis Digital",
                descJurusan =  "Salah satu jurusan yang laku untuk para pembisnis yang memiliki ide kreatif"
            ),
            Jurusan(
                R.drawable.profile_picture,
                nameJurusan = "Teknik Informatika",
                descJurusan = "Merupakan jurusan yang banyak melahirkan coder-coder profesional."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_jurusan)
        recyclerView.layoutManager = LinearLayoutManager (this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = Adapter(this, jurusanlist){
            val intent = Intent (this, detail_role::class.java)
            intent.putExtra(INTEN_PARCELABLE, it)
            startActivity(intent)
        }
    }
}

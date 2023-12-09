package com.example.tugas_advance_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView

private val MainActivity.Companion.INTENT_PARCELABLE: String?
    get() {
        TODO("Not yet implemented")
    }

private fun <T> Parcelable.getParcelableExtra(): Any {
    TODO("Not yet implemented")
}

class detail_role : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_role)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val Jurusan = intent.getParcelableExtra<Jurusan>(MainActivity.INTENT_PARCELABLE)

        val imgJurusan = findViewById<ImageView>(R.id.img_item_photo)
        val nameJurusan = findViewById<TextView>(R.id.tv_item_name)
        val descJurusan = findViewById<TextView>(R.id.tv_item_deskripsi)


        imgJurusan.setImageResource(Jurusan?.imgJurusan!!)
        nameJurusan.text = Jurusan.nameJurusan
        descJurusan.text = Jurusan.descJurusan
    }

    @Suppress("DEPRECATION")
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
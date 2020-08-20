package com.example.androidstackmemberslistrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerList = mutableListOf(
            Recycler(R.drawable.ari_tamunomiebi, "Ari Tamunomiebi", "Stack Lead"),
            Recycler(R.drawable.abdulrasaq_durosomo, "Abdulrasaq Durosomo", "Stack Associate"),
            Recycler(R.drawable.osehiase_ehilen, "Osehiase Ehilen", "Stack Associate"),
            Recycler(R.drawable.me, "Ransom Ahanmisi", "Stack Rep"),
            Recycler(R.drawable.daniel_ayodeji, "Daniel Ayodeji", "Member"),
            Recycler(R.drawable.david_omu, "David Omu", "Member"),
            Recycler(R.drawable.samuel_oyedele, "Samuel Oyedele", "Member"),
            Recycler(R.drawable.samuel_ochuba, "Samuel Ochuba", "Member"),
            Recycler(R.drawable.timring_timkwali, "Timring Timkwali", "Member"),
            Recycler(R.drawable.omodo_oghenemokome, "Omodo Oghenemokome", "Member"),
            Recycler(R.drawable.emmanuel_ututu, "Emmanuel Ututu", "Member"),
            Recycler(R.drawable.olalekan_fagbemi, "Olalekan Fagbemi", "Member"),
            Recycler(R.drawable.oladapo_oladokun, "Oladapo  Oladokun", "Member"),
            Recycler(R.drawable.kingsley_izundu, "Kingsley Izundu", "Member"),
            Recycler(R.drawable.victor_adewumi, "Victor Adewumi", "Member"),
            Recycler(R.drawable.fredrick_chibuzor, "Fredrick Chibuzor", "Member")
        )
        recyclerView.adapter = RecyclerAdapter(recyclerList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
}
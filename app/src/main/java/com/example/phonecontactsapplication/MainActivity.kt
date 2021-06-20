package com.example.phonecontactsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvContacts= findViewById<RecyclerView>(R.id.rvContacts)
        var contactList= listOf(
            ContactBook("Pamela Umutoni","+250781405420","umutoni@gmail.com"),
            ContactBook("Celine Gushima","+250787397661","gushimaa@gmail.com"),
            ContactBook("SaraH Papayi","+250785723810","papai@gmail.com"),
            ContactBook("Belyse Intwaza","+25078919494","belyse@gmail.com"),
            ContactBook("Keza Phionah","+250781597322","keza@gmail.com"),
            ContactBook("Grace Maina","+250789015689","maina@gmail.com")
        )
        var ContactAdapter= ContactAdapter(contactList)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter= ContactAdapter
    }
}
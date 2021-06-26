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
            ContactBook("Pamela Umutoni","+250781405420","umutoni@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1"),
            ContactBook("Celine Gushima","+250787397661","gushimaa@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1"),
            ContactBook("SaraH Papayi","+250785723810","papai@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1"),
            ContactBook("Belyse Intwaza","+25078919494","belyse@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1"),
            ContactBook("Keza Phionah","+250781597322","keza@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1"),
            ContactBook("Grace Maina","+250789015689","maina@gmail.com","https://cms.qz.com/wp-content/uploads/2018/09/CELINE_VIP_180830_LADY_GAGA_B.jpg?quality=75&strip=all&w=410&h=492&crop=1")
        )
        var ContactAdapter= ContactAdapter(contactList,baseContext)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter= ContactAdapter
    }

}
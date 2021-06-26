package com.example.phonecontactsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.awt.font.TextAttribute

class ContactView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_view)
        var nameIntent= intent.getStringExtra("name")
        var phoneIntent= intent.getStringExtra("phone")
        var emailIntent= intent.getStringExtra("email")
        var imageIntent= intent.getStringExtra("image").toString()

        var name= findViewById<TextView>(R.id.tvPerson)
        var phone= findViewById<TextView>(R.id.tvSim)
        var email= findViewById<TextView>(R.id.tvGmail)
        var image= findViewById<ImageView>(R.id.imgPerson)

        name.text= nameIntent
        phone.text=phoneIntent
        email.text= emailIntent
//        image.drawable= imageIntent
        Picasso.get().load(imageIntent).into(image)



    }
}
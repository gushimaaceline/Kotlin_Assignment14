package com.example.phonecontactsapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<ContactBook>,var context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView= LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact= contactList.get(position)
        holder.tvName.text= currentContact.contactName
        holder.tvNumber.text= currentContact.phoneNumber
        holder.tvEmail.text = currentContact.email
        Picasso
            .get().load(currentContact.imageUrl)
            .placeholder(R.drawable.jeodo)
            .into(holder.imgContact)
        holder.cvContact.setOnClickListener {
            var intent= Intent(context,ContactView::class.java)
            intent.putExtra("name",currentContact.contactName)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class ContactViewHolder(var itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName= itemView.findViewById<TextView>(R.id.tvPersonName)
    var tvNumber= itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail= itemView.findViewById<TextView>(R.id.tvEmail)
    var imgContact= itemView.findViewById<ImageView>(R.id.imgContact)
    var cvContact= itemView.findViewById<CardView>(R.id.cvContact)
}

package com.example.phonecontactsapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var contactList: List<ContactBook>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
       var itemView= LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact= contactList.get(position)
        var tvName= currentContact.contactName
        var tvNumber= currentContact.phoneNumber
        var tvEmail= currentContact.email
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName= itemView.findViewById<TextView>(R.id.tvPersonName)
    var tvNumber= itemView.findViewById<TextView>(R.id.tvNumber)
    var tvEmail= itemView.findViewById<TextView>(R.id.tvEmail)
}

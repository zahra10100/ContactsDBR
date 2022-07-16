package com.example.userapp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterUs(var users:ArrayList<ModelUs>): RecyclerView.Adapter<AdapterUs.ViewHolderItem> (){

    inner class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView){
        var nameA=itemView.findViewById<TextView>(R.id.name2)
        var numberA=itemView.findViewById<TextView>(R.id.number2)

        fun  bind(modelP:ModelUs){
            nameA.text=modelP.name
           numberA.text=modelP.number
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val V: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return  ViewHolderItem(V)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
//        holder.bind(users[position])
        holder.nameA.text = users[position].name.toString()
        holder.numberA.text=users[position].number.toString()
    }

    override fun getItemCount(): Int {
        return users.size
    }
}

package com.example.sportzz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class myadpater(private val List : ArrayList<updates>) : RecyclerView.Adapter<myadpater.myviewholder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return myviewholder(itemView)
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {
        val currentItem = List[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvheading.text = currentItem.heading
        holder.body.text = currentItem.body

    }

    override fun getItemCount(): Int {
        return List.size
    }

    class myviewholder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvheading : TextView = itemView.findViewById(R.id.title)
        val body : TextView = itemView.findViewById(R.id.body)


    }

}
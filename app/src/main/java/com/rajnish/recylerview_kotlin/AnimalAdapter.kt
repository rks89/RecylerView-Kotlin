package com.rajnish.recylerview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*


class AnimalAdapter(val items : ArrayList<String>, val context: Context):  RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: AnimalAdapter.ViewHolder, position: Int)
    {
        holder?.tvAnimalType?.text = items.get(position)

    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }
    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Holds the TextView that will add each animal to
        val tvAnimalType = itemView.tv_animal_type

    }
}

package com.example.apidog.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.dog_item.view.*
import com.example.apidog.R
import com.example.apidog.model.Dog
import kotlinx.android.synthetic.main.dog_item.view.*

class AdapterDogs () : RecyclerView.Adapter<AdapterDogs.ViewHolder>() {

    lateinit var items: ArrayList<Dog>

    override fun getItemCount(): Int {
        return if(::items.isInitialized){
            items.size
        }else{
            0
        }

    }
    fun setDogs(items: List<Dog>) {
        this.items = items as ArrayList<Dog>
        notifyDataSetChanged()
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.dog_item, parent, false))

    // Binds each item in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model= items[position]
        holder.sizeInfo.text="${model.alt_names}"
        Picasso.get()
            .load("https://cdn2.thedogapi.com/images/BJa4kxc4X.jpg")
            .into( holder.dogImage)
    }
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each picture to
        val dogImage: ImageView = view.dog_image
        val sizeInfo: TextView = view.name
    }
}
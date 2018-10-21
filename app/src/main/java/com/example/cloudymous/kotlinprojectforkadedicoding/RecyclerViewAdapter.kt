package com.example.cloudymous.kotlinprojectforkadedicoding

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cloudymous.kotlinprojectforkadedicoding.R.id.image
import kotlinx.android.synthetic.main.club_list.*
import com.squareup.picasso.Picasso
import com.squareup.picasso.Picasso.*
import kotlinx.android.synthetic.main.club_list.view.*

class RecyclerViewAdapter(private val context: Context, private val items: List<Club>, private val listener: (Club) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.club_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

//        private val name = view.findViewById<TextView>(R.id.name)
//        private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: Club, listener: (Club) -> Unit) {
            itemView.name.text = items.name
//            itemView.image?.let { itemView.image.setImageResource(it) }
            itemView.image?.let { Picasso.get().load(it).into(image) }
            itemView.setOnClickListener{
                listener(items)
            }
        }
    }


}
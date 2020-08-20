package com.example.androidstackmemberslistrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler.view.*

class RecyclerAdapter(private val recyclerList: List<Recycler>) : RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.imageView
        val textView : TextView = itemView.textView
        val textView2 : TextView = itemView.textView2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler,
        parent, false)
        return RecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val currentItem = recyclerList[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text1
        holder.textView2.text = currentItem.text2
    }

    override fun getItemCount() = recyclerList.size

    interface OnRecyclerClick{
        fun click(data: Recycler)
    }
}
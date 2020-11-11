package com.walkity.apps.done

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoneItemsAdapter(private val itemsList: ArrayList<String>):
    RecyclerView.Adapter<DoneItemsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val linearLayout = LayoutInflater
            .from(parent.context).inflate(R.layout.done_item, parent, false)
                as LinearLayout
        return ViewHolder(linearLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val main = holder.todoItemView
        val name = main.getChildAt(0) as TextView
        name.text = itemsList[position]
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    class ViewHolder(val todoItemView: LinearLayout) : RecyclerView.ViewHolder(todoItemView)
}
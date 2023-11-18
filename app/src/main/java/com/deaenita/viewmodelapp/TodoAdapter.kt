package com.deaenita.viewmodelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(var todos: List<TodoModel>) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): TodoViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return TodoViewHolder(view)
    }
    override fun onBindViewHolder(holder: TodoViewHolder, position:
    Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tv_todo).text = todos[position].task
            findViewById<TextView>(R.id.tv_description).text = todos[position].task
        }
    }
    override fun getItemCount(): Int {
        return todos.size
    }
}
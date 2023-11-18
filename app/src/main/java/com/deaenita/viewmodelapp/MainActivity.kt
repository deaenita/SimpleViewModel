package com.deaenita.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoVM = TodoViewModel()
        val adapter = TodoAdapter(todoVM.getTodos())
        val rvTodo = findViewById<RecyclerView>(R.id.rv_todo)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)
    }
}
package com.walkity.apps.done

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var todoList: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todoList = findViewById(R.id.todo_list)
    }

    fun addTask(view: View) {
        val intent: Intent = Intent(this, AddTaskActivity::class.java)
        startActivity(intent)
    }
}

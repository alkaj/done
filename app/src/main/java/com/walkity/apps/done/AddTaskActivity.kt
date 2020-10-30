package com.walkity.apps.done

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch

class AddTaskActivity : AppCompatActivity() {
    lateinit var taskNameInput: EditText
    lateinit var taskPriority: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)

        taskNameInput = findViewById(R.id.add_task_input)
        taskPriority = findViewById(R.id.task_priority)
    }

    fun cancelTask(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun saveTask(view: View) {}
}

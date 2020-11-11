package com.walkity.apps.done

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var  doneItemsList: RecyclerView
    lateinit var doneItemsAdapter: DoneItemsAdapter
    lateinit var recyclerLayoutManager: RecyclerView.LayoutManager

    var list: ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add("Vider la poubelle")
        list.add("Laver les habits")
        list.add("Gerer la journee 3")
        list.add("Faire la partie CSS3")
        list.add("Preparer la partie Javascript")

        doneItemsList = findViewById(R.id.todo_list)
        recyclerLayoutManager = LinearLayoutManager(this)
        doneItemsAdapter = DoneItemsAdapter(list)

        doneItemsList.apply {
            setHasFixedSize(true)
            layoutManager = recyclerLayoutManager
            adapter = doneItemsAdapter
        }
    }

    fun addTask(view: View) {
        val intent: Intent = Intent(this, AddTaskActivity::class.java)
        startActivity(intent)
    }
}

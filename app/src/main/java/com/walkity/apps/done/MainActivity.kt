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

    var list: ArrayList<DoneItem> = ArrayList<DoneItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(DoneItem("Prepa GDE", true))
        list.add(DoneItem("Vider la poubelle"))
        list.add(DoneItem("Laver les habits", true))
        list.add(DoneItem("Gerer la journee 3", true))
        list.add(DoneItem("Faire la partie CSS3"))
        list.add(DoneItem("Preparer la partie Javascript", true))

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

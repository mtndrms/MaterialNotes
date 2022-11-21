package com.materialtools.notes.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.materialtools.notes.R
import com.materialtools.notes.adapters.NotesRecyclerViewAdapter
import com.materialtools.notes.utils.MockData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNotes: RecyclerView = findViewById(R.id.rvNotes)

        rvNotes.layoutManager = LinearLayoutManager(this)
        rvNotes.adapter = NotesRecyclerViewAdapter(MockData.mockData)
    }
}
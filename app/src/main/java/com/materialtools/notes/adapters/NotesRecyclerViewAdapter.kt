package com.materialtools.notes.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.materialtools.notes.R
import com.materialtools.notes.activities.NoteActivity
import com.materialtools.notes.models.Note
import java.util.*

class NotesRecyclerViewAdapter(private val notes: List<Note>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_note_recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ItemViewHolder -> {
                holder.bind(notes[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val calendar: Calendar = Calendar.getInstance()

        private val tvTitle: TextView = itemView.findViewById(R.id.noteTitle)
        private val tvDetailsOverview: TextView = itemView.findViewById(R.id.noteDetailOverview)
        private val tvNoteDateOfCreation: TextView = itemView.findViewById(R.id.noteDate)

        fun bind(note: Note) = with(itemView) {
            tvTitle.text = note.title
            tvDetailsOverview.text = note.details
            tvNoteDateOfCreation.text = note.createdAt.toString()

            itemView.setOnClickListener {
                val intent = Intent(it.context as AppCompatActivity, NoteActivity::class.java)
                it.context.startActivity(intent)
            }
        }
    }
}
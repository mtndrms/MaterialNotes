package com.materialtools.notes.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.materialtools.notes.R
import com.materialtools.notes.utils.MockData

class NoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val svTextAreaEditNoteContainer: ScrollView = findViewById(R.id.svTextAreaEditNoteContainer)
        val svNoteContainer: ScrollView = findViewById(R.id.svNoteContainer)
        val etNote: EditText = findViewById(R.id.textAreaEditNote)
        val ivCloseNote: ImageView = findViewById(R.id.ivCloseNote)
        val etEditTitle: EditText = findViewById(R.id.etEditTitle)
        val tvNote: TextView = findViewById(R.id.tvNote)
        val tvNoteTitle: TextView = findViewById(R.id.tvNoteTitle)
        val fabEdit: FloatingActionButton = findViewById(R.id.fabEdit)

        tvNoteTitle.text = MockData.fakeNoteDetail.first().toString()

        fabEdit.setOnClickListener {
            if (svNoteContainer.visibility == View.VISIBLE) {
                fabEdit.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.icon_done_editing
                    )
                )
                svNoteContainer.visibility = View.GONE
                svTextAreaEditNoteContainer.visibility = View.VISIBLE
                tvNoteTitle.visibility = View.GONE
                etEditTitle.visibility = View.VISIBLE

                etEditTitle.setText(
                    MockData.fakeNoteDetail.first().toString(),
                    TextView.BufferType.EDITABLE
                )
                etNote.setText(MockData.fakeNoteDetail, TextView.BufferType.EDITABLE)
            } else {
                fabEdit.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.icon_edit_note
                    )
                )
                svNoteContainer.visibility = View.VISIBLE
                svTextAreaEditNoteContainer.visibility = View.GONE

                etEditTitle.visibility = View.GONE
                tvNoteTitle.visibility = View.VISIBLE
            }
        }

        ivCloseNote.setOnClickListener {
            finish()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            tvNote.text = MockData.fakeNoteDetail
        }
    }
}
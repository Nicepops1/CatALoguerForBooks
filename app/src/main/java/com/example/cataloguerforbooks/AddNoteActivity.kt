package com.example.cataloguerforbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class AddNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
    }

    override fun onCreateOptionsMenu(menu: Menu) : Boolean {
        getMenuInflater().inflate(R.menu.addnote, menu)
        return true
    }
}
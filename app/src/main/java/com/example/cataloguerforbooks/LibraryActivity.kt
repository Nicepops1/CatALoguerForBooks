package com.example.cataloguerforbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.library, menu)
        return true
    }

    fun goToAddNote(item: MenuItem) {
        val AddNoteIntent = Intent(this, AddNoteActivity :: class.java)
        startActivity(AddNoteIntent)
    }

}
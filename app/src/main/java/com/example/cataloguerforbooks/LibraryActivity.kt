package com.example.cataloguerforbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.library, menu)
        return true
    }

}
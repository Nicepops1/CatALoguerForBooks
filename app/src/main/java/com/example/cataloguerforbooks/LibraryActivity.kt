package com.example.cataloguerforbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.asLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cataloguerforbooks.databinding.ActivityLibraryBinding
import com.example.cataloguerforbooks.db.MainDb

class LibraryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLibraryBinding
    val bookAdapter = BookAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.library, menu)
        return true
    }

    fun goToAddNote(item: MenuItem) {
        val AddNoteIntent = Intent(this, AddNoteActivity :: class.java)
        startActivity(AddNoteIntent)
    }

    override fun onResume() {
        super.onResume()
        updateLibraryList()
        bookAdapter.updateBookList()
    }
    private fun init(){
        binding.apply {
            libraryList.layoutManager = LinearLayoutManager(this@LibraryActivity)
            libraryList.adapter = bookAdapter
        }
    }
    fun updateLibraryList(){
        val db = MainDb.getDb(this)
        bookAdapter.updateBookList()
        db.getDao().getAllItem().asLiveData().observe(this){ list->
            list.forEach{
                val bookData = BookData(it.Title, it.Author)
                bookAdapter.addBook(bookData)
            }
        }
    }
}
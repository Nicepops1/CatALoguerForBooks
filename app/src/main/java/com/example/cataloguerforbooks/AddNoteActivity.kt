package com.example.cataloguerforbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.cataloguerforbooks.databinding.ActivityAddNoteBinding
import com.example.cataloguerforbooks.db.Book
import com.example.cataloguerforbooks.db.MainDb

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = MainDb.getDb(this)
        binding.addBtn.setOnClickListener {
            val item = Book(null,
                binding.edTitle.text.toString(),
                binding.edAuthor.text.toString()
            )
            Thread{
                db.getDao().insertItem(item)
            }.start()
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu) : Boolean {
        getMenuInflater().inflate(R.menu.addnote, menu)
        return true
    }
}
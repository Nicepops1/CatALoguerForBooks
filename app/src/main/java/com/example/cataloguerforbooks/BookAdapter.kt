package com.example.cataloguerforbooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cataloguerforbooks.databinding.LibraryItemBinding

class BookAdapter : RecyclerView.Adapter<BookAdapter.BookHolder>() {
    val booklist = ArrayList<BookData>()
    class BookHolder(item: View): RecyclerView.ViewHolder(item) {

        val binding = LibraryItemBinding.bind(item)
        fun bind(bookdata: BookData) = with(binding){
            TitleName.text = bookdata.Title
            AuthorText.text = bookdata.Author
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.library_item, parent, false)
        return BookHolder(view)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder.bind(booklist[position])
    }

    override fun getItemCount(): Int {
        return booklist.size
    }

    fun addBook(bookdata: BookData){
        booklist.add(bookdata)
        notifyDataSetChanged()
    }
    fun updateBookList(){
        booklist.clear()

    }

}
package com.example.cataloguerforbooks.db

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class MyDbManager(val context: Context) {
    val myDbHelper = myDbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDb(){
        db = myDbHelper.writableDatabase
    }
    fun insertToDb(title: String, author: String, genre: String){
        val values = ContentValues().apply{
            put(ObBook.COLUMN_TITLE, title)
            put(ObBook.COLUMN_AUTHOR, author)
            put(ObBook.COLUMN_GENRE, genre)
        }
        db?.insert(ObBook.TABLE_NAME, null, values)
    }
    @SuppressLint("Range")
    fun readDbData() : ArrayList<String>{
        val dataList = ArrayList<String>()
        val cursor = db?.query(
            ObBook.TABLE_NAME,
            null,
            null,
            null,
            null,
            null,
            null
        )


            while (cursor?.moveToNext()!!){
                val dataTitle = cursor.getString(cursor.getColumnIndex(ObBook.COLUMN_TITLE))
                dataList.add(dataTitle.toString())
            }
        cursor.close()
        return dataList
    }
}
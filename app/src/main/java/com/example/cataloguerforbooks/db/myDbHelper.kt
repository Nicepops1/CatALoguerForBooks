package com.example.cataloguerforbooks.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class myDbHelper(context: Context) : SQLiteOpenHelper(context, ObBook.DATABASE_NAME, null,
    ObBook.DATABASE_VERSION){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(ObBook.CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(ObBook.SQL_DELETE_TABLE)
        onCreate(db)
    }

}
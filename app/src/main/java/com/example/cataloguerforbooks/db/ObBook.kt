package com.example.cataloguerforbooks.db

import android.provider.BaseColumns

object ObBook : BaseColumns {
    const val TABLE_NAME = "Book_table"
    const val COLUMN_TITLE = "Title"
    const val COLUMN_AUTHOR = "Author"
    const val COLUMN_GENRE = "Genre"

    const val DATABASE_NAME = "Cataloguer.db"
    const val DATABASE_VERSION = 1

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY, $COLUMN_TITLE TEXT, $COLUMN_AUTHOR TEXT, $COLUMN_GENRE TEXT"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}
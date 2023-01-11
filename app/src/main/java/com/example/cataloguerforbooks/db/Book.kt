package com.example.cataloguerforbooks.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "items")
data class Book (
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "Title")
    var Title : String,
    @ColumnInfo(name = "Author")
    var Author : String

        )
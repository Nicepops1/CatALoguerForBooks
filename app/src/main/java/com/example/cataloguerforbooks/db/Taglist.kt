package com.example.cataloguerforbooks.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Taglist(
    @PrimaryKey(autoGenerate = true)
    var id : Int? = null,
    @ColumnInfo(name = "Tag")
    var Tag : String
)

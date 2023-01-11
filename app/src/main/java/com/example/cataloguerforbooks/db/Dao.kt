package com.example.cataloguerforbooks.db

import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@androidx.room.Dao
interface Dao {
    @Insert
    fun insertItem(item: Book)
    @Query("SELECT*FROM items")
    fun getAllItem() : Flow<List<Book>>
}
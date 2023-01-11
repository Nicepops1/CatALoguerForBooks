package com.example.cataloguerforbooks.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = [Book::class,Taglist::class], version = 1)
abstract class MainDb : RoomDatabase(){
    abstract fun getDao(): Dao

    companion object{
        fun getDb(context: Context): MainDb{
            return Room.databaseBuilder(
                context.applicationContext,
                MainDb::class.java,
                "MainDb"
            ).build()
        }
    }
}
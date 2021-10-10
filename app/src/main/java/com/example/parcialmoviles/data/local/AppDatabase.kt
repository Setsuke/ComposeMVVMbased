package com.example.parcialmoviles.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.parcialmoviles.data.model.Album

@Database(entities=[Album::class],version = 1,exportSchema = false)
abstract  class AppDatabase: RoomDatabase(){
    abstract fun albumDao(): AlbumDao
}
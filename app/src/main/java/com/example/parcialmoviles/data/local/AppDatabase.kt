package com.example.parcialmoviles.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.parcialmoviles.data.model.General

@Database(entities=[General::class],version = 1,exportSchema = false)
abstract  class AppDatabase: RoomDatabase(){
    //abstract fun generalDao(): GeneralDao
}
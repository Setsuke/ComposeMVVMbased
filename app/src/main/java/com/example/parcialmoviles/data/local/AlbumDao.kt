package com.example.parcialmoviles.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.parcialmoviles.data.model.Album

@Dao
interface AlbumDao {

    @Insert
    suspend fun insert(vararg album: Album)

    @Delete
    suspend fun delete(vararg album: Album)

    @Query("select * from albums where id =:id")
    suspend fun fetchById(id: String): Album?
}
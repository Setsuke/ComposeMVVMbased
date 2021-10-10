package com.example.parcialmoviles.repository

import com.example.parcialmoviles.data.local.AlbumDao
import com.example.parcialmoviles.data.model.Album
import com.example.parcialmoviles.data.remote.AlbumService
import javax.inject.Inject

class AlbumRepository @Inject constructor (
    private val albumService: AlbumService,
    private val albumDao: AlbumDao
) {
    suspend fun fetchAlbum(): List<Album> {
        val response = albumService.fetchAlbums()
        println( response.body())
        if(response.isSuccessful && response.body() != null){
                println(response.body()!!.albums)
                return response.body()!!.albums
        }
        return listOf()
    }
    suspend fun insert(vararg album: Album) = albumDao.insert(*album)

    suspend fun delete(vararg album: Album) = albumDao.delete(*album)
}
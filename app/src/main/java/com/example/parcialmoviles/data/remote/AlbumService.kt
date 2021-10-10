package com.example.parcialmoviles.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {
    @GET("mostloved.php?format=album")
    suspend fun fetchAlbums(): Response<ApiResponse>
}
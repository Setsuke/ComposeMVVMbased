package com.example.parcialmoviles.data.remote

import com.example.parcialmoviles.data.model.Album
import com.google.gson.annotations.SerializedName

class ApiResponse(

    @SerializedName("loved")
    val albums: List<Album>
)
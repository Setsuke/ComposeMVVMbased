package com.example.parcialmoviles.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "albums")
class Album(
    @SerializedName("idAlbum")
    @PrimaryKey
    @ColumnInfo(name = "id")
    val idAlbum: String,
    @SerializedName("strAlbum")
    @ColumnInfo(name = "strAlbum")
    val strAlbum: String,
    @SerializedName("strAlbum3DThumb")
    @ColumnInfo(name = "strAlbum3DThumb")
    val strAlbum3DThumb: String,
    @SerializedName("strArtist")
    @ColumnInfo(name = "strArtist")
    val strArtist: String,
) {
    @Ignore
    var favorite: Boolean = false
}
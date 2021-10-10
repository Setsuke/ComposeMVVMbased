package com.example.parcialmoviles.screens.Album

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.parcialmoviles.data.model.Album

@Composable
fun Albums(albumViewModel: AlbumViewModel) {

    Scaffold() {
        Column() {
            AlbumList(albumViewModel)
        }
    }

}

@Composable
fun AlbumList(viewModel: AlbumViewModel) {
    val albums : List<Album> by viewModel.albums.observeAsState(listOf())
    LazyColumn {
        items(albums) {
                album->
            AlbumRow(album, insertAlbum={viewModel.insert(album)},
                deleteAlbum={viewModel.delete(album)})
        }
    }
}

@Composable
fun AlbumRow(album: Album, insertAlbum: () -> Unit, deleteAlbum: () -> Unit) {
    var favorite by remember {
        mutableStateOf(false)
    }
    favorite = album.favorite

    Card (
        modifier = Modifier
            .padding(5.dp)

    ) {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            elevation = 3.dp
        ) {
            Row{
                AlbumImage(album)
                Spacer(modifier = Modifier.width(10.dp))
                Column(modifier = Modifier.weight(7f)) {
                    Text(album.strAlbum, fontWeight = FontWeight.Bold)
                    Text(album.strArtist)
                }
                IconButton(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        if (favorite) {
                            deleteAlbum()
                        } else {
                            insertAlbum()
                        }
                        favorite = !favorite
                    }) {
                    Icon(
                        Icons.Filled.Favorite,
                        null,
                        tint = if (favorite) Color.Red else MaterialTheme.colors.onSurface
                    )
                }
            }
        }
    }

}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun AlbumImage(album: Album) {
    Image(
        painter = rememberImagePainter(album.strAlbum3DThumb),
        contentDescription =  null,
        modifier = Modifier.size(92.dp)
            .clip(shape = RoundedCornerShape(4.dp)),
        contentScale =  ContentScale.Crop
    )
}




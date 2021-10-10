package com.example.parcialmoviles.screens.Album

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.parcialmoviles.data.model.Album
import com.example.parcialmoviles.repository.AlbumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumViewModel @Inject constructor(private val albumRepository: AlbumRepository): ViewModel() {
    private var _albums = MutableLiveData<List<Album>>()
    val albums get() = _albums


    fun fetchAlbums() {
        viewModelScope.launch {
            _albums.postValue(albumRepository.fetchAlbum())
        }
    }

    fun insert(album: Album) {
        viewModelScope.launch {
            albumRepository.insert(album)
        }
    }

    fun delete(album: Album) {
        viewModelScope.launch {
            albumRepository.delete(album)
        }
    }
}
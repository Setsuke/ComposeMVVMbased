package com.example.parcialmoviles.di

import com.example.parcialmoviles.data.local.AlbumDao
import com.example.parcialmoviles.data.remote.AlbumService
import com.example.parcialmoviles.repository.AlbumRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    @Provides
    @ViewModelScoped
    fun provideAlbumRepository(
        albumService: AlbumService,
        albumDao: AlbumDao
    ): AlbumRepository {
        return AlbumRepository(albumService, albumDao)
    }
}
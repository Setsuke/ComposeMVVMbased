package com.example.parcialmoviles.screens.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcialmoviles.screens.Album.AlbumViewModel
import com.example.parcialmoviles.screens.Album.Albums

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController =  navController, startDestination = Routes.AlbumsList.route) {
        composable(Routes.AlbumsList.route) {
            val albumViewModel : AlbumViewModel = hiltViewModel()
            albumViewModel.fetchAlbums()
            Albums(albumViewModel = albumViewModel)
        }
    }
}




sealed class Routes(val route:String) {
    object AlbumsList : Routes("AlbumsList")

}
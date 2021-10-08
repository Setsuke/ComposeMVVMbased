package com.example.parcialmoviles.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

//    NavHost(
//        navController = navController,
//        startDestination = Routes.GeneralList.route
//    ) {
//        composable(Routes.HeroList.route) {
//            val viewModel: HeroesViewModel = hiltViewModel()
//            Heroes(viewModel) {
//                navController.navigate("${Routes.HeroDetails.route}/$it")
//            }
//        }
//
//        composable(
//            route = Routes.HeroDetails.routeWithArgument,
//            arguments = listOf(navArgument(Routes.HeroDetails.argument) {
//                type = NavType.StringType
//            })
//        ) { backStackEntry ->
//            val id = backStackEntry.arguments?.getString(Routes.HeroDetails.argument, "") as String
//            val detailsViewModel: HeroDetailsViewModel = hiltViewModel()
//            detailsViewModel.fetchHeroById(id)
//            HeroDetails(detailsViewModel)
//        }
//    }
}




sealed class Routes(val route: String){
//    object GeneralList: Routes("GeneralList")
//    object GeneralDetails:Routes("GeneralDetails") {
//        const val routeWithArgument = "GeneralDetails/{id}"
//        const val argument = "id"
//    }
}
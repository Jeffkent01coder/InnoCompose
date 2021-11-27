package com.jeff.innocompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(navController: NavHostController){
    NavHost(navController = navController,
        startDestination = Screen.HomeScreen.route)
    {
        composable(
            route = Screen.HomeScreen.route
        )
        {
            HomeScreen(navController)
        }

        composable(
            route = Screen.ProfileScreen.route
        )
        {
            ProfileScreen(navController)
        }
    }

}
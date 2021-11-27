package com.jeff.innocompose

sealed class Screen(val route : String){
    object HomeScreen : Screen("home_screen")
    object ProfileScreen : Screen("profile_screen")
}

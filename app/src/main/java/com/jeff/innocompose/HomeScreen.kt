package com.jeff.innocompose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(), 
        contentAlignment = Alignment.Center)
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        
        ) {
            Text(text = "Home Screen",
            color = MaterialTheme.colors.primary,
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = Bold
            
            )
            Button(onClick = {
                navController.navigate(Screen.ProfileScreen.route)
            })
            
                {
                Text(text = "Go to profile")
            }
        }
    }
}

@Composable
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
fun HomeScreenPrev(){
    HomeScreen(navController = rememberNavController())

}
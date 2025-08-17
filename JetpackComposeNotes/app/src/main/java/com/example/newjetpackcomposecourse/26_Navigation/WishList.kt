package com.example.newjetpackcomposecourse.`26_Navigation`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun WishListScreen(navController : NavController){
    Column(

        modifier = Modifier.fillMaxSize().background(color = Color.Green),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "This is the WishList Screen",
            fontSize = 30.sp
        )
        Spacer(Modifier.height(25.dp))
        Button(
            onClick = {

                navController.navigate(Routes.Home)

            }
        ) {
            Text(text = "Go to HomeScreen")
        }
    }


}


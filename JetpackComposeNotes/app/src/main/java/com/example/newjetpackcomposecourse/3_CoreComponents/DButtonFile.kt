package com.example.newjetpackcomposecourse.`3_CoreComponents`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview


// Filled Button


@Composable
fun FilledButtonSample() {
    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()
        , contentAlignment = Alignment.Center
    ){

//        Button(
//            onClick = {
//
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//
//            }
//        ){
//            Text("Filled Button")
//
//        }

//
//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context, "Tonal Button is clicked", Toast.LENGTH_SHORT).show()
//            },
//
//        ) {
//
//            Text("Tonal Button")
//        }



        // 3. Outlined Button

//        OutlinedButton(
//
//            onClick = {
//
//
//            }
//        ) {
//            Text("Outlined Button")
//        }

        // 4. Elevated Button

//        ElevatedButton(
//
//            onClick = {
//
//            }
//
//        ) {
//
//            Text("Elevated Button")
//        }

        // 5. Text Button
//        TextButton(
//
//            onClick = {
//
//            }
//        ) {
//
//            Text("Text Button")
//        }




    }
}







@Preview(showSystemUi = true)
@Composable
fun FilledButtonSamplePreview() {

    FilledButtonSample()

}


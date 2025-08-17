package com.example.newjetpackcomposecourse.`10_FloatingButton`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newjetpackcomposecourse.`9_AlertDialogBox`.DialogWithImage

@Composable
fun ExtendedFloatingActionButtonExample(){


    Box(
        modifier = Modifier.fillMaxSize()
        , contentAlignment = Alignment.Center

    ){

        ExtendedFloatingActionButton(
            onClick = {

            },

            content = {
                Text("this is Floating button")
            }
        )

}



}


@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {

   ExtendedFloatingActionButtonExample()

}



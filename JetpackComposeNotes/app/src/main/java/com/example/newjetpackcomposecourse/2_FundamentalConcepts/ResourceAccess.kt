package com.example.newjetpackcomposecourse.`2_FundamentalConcepts`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newjetpackcomposecourse.R


@Composable
fun AccessStringResource() {

    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {

        Text(text = stringResource(R.string.Fruit), color = colorResource(R.color.orange))

    }
}


@Composable
fun AccessImage() {

    Box(

        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {

        Image(painter = painterResource(R.drawable.news), contentDescription = "newImage")

    }
}


@Preview(showSystemUi = true)
@Composable
fun ResourcePreview() {


    AccessImage()

}



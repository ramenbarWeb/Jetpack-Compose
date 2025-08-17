package com.example.newjetpackcomposecourse.`14_ProgresIndicator`

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun CircularIndicatorEx() {
    var loading by remember { mutableStateOf(false) }

    // Simulate loading delay and reset loading to false
    LaunchedEffect(loading) {
        if (loading) {
            delay(3000) // Show loading for 3 seconds
            loading = false
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { loading = true },
            enabled = !loading
        ) {
            Text("Start Loading")
        }

        Spacer(modifier = Modifier.height(15.dp))

        if (loading) {
            CircularProgressIndicator(
                modifier = Modifier.width(64.dp),
                color = MaterialTheme.colorScheme.secondary,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
    CircularIndicatorEx()
}

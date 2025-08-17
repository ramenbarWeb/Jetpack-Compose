package com.example.newjetpackcomposecourse.`21_Switch`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newjetpackcomposecourse.`20_Badges`.BadgeInteractiveExample


@Composable
fun SwitchEx() {

    var checked by remember { mutableStateOf(true) }

    Box(modifier = Modifier.fillMaxSize(),

        contentAlignment = Alignment.Center
        ){
        Switch(
            checked = checked,
            onCheckedChange = {

                checked = it
            },
            thumbContent = if (checked) {
                {
                    Icon(
                        imageVector = Icons.Filled.Check, contentDescription = null,
                        modifier = Modifier.size(SwitchDefaults.IconSize)
                    )
                }
            } else {

                null
            }
        )

    }


}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
    SwitchEx()
}





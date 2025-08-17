package com.example.newjetpackcomposecourse.`8_InputChips`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.rememberGraphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import com.example.newjetpackcomposecourse.`7_CheckBox`.CheckBoxExample


@Composable
fun InputChipExample(){

    var  enable by remember{
        mutableStateOf(true)

    }

    Box(

        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        if (enable){

            InputChip(
                onClick = {

                    enable = !enable

                },
                label = {
                    Text("Enabled")
                },
                selected = enable,
                avatar = {
                    Icon(Icons.Filled.Person,
                        contentDescription = "Localized description"
                        ,    Modifier.size(InputChipDefaults.AvatarSize)
                    )

                },
                trailingIcon = {
                    Icon(Icons.Filled.Close,
                        contentDescription = "Localized description"
                        , Modifier.size(InputChipDefaults.AvatarSize)
                    )

                }
            )

        }
    }

}


@Preview(showSystemUi = true)
@Composable
fun ChipExamplePreview() {

    InputChipExample()

}




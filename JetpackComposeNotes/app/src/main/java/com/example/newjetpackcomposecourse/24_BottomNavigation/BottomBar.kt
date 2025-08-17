package com.example.newjetpackcomposecourse.`24_BottomNavigation`

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.bottombar.AnimatedBottomBar
import com.example.bottombar.components.BottomBarItem
import com.example.bottombar.model.IndicatorDirection
import com.example.bottombar.model.IndicatorStyle
import com.example.newjetpackcomposecourse.`23_TimePicker`.TimePickerEx


data class BottomNavItem(val name: String, val icon: ImageVector, val unselectedIcon: ImageVector)

@Composable
fun BottomNavigationBar() {

    var selectedItem by remember { mutableIntStateOf(0) }
    val BottomNavItem = listOf(
        BottomNavItem("Home", Icons.Default.Home, unselectedIcon = Icons.Outlined.Home),
        BottomNavItem("WishList", Icons.Default.Favorite, unselectedIcon = Icons.Outlined.Favorite),
        BottomNavItem(
            "Cart", Icons.Default.ShoppingCart, unselectedIcon = Icons.Outlined.ShoppingCart
        ),
        BottomNavItem("Profile", Icons.Default.Person, unselectedIcon = Icons.Outlined.Person)

    )

    Scaffold(

        bottomBar = {
            Surface(
                modifier = Modifier.fillMaxWidth().padding(
                    bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding()
                )
            ) {
                AnimatedBottomBar(
                    selectedItem = selectedItem,
                    itemSize = BottomNavItem.size,
                    containerColor = Color.Transparent,
                    indicatorColor = MaterialTheme.colorScheme.primary,
                    indicatorDirection = IndicatorDirection.TOP,
                    indicatorStyle = IndicatorStyle.LINE

                ) {
                    BottomNavItem.forEachIndexed{index, navigationItem->

                        BottomBarItem(
                            modifier = Modifier.align(alignment = Alignment.Top),
                            selected = selectedItem == index,
                            onClick = {
                                selectedItem = index
                                when(index){




                                }
                            },
                            imageVector = navigationItem.icon,
                            label = navigationItem.name,
                            containerColor = Color.Transparent
                        )




                    }

                }


            }


        }
    ) { innerpadding->



    }


}

@Preview(showSystemUi = true)
@Composable
fun ExamplePreview() {
   BottomNavigationBar()
}



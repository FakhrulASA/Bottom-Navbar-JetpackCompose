package com.fakhrulasa.bottomnavbarjetpackcompose.ui.Components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.fakhrulasa.bottomnavbarjetpackcompose.NavigationItem

object BottomNav {
    @Composable
    fun BottomNavigationBar() {
        var items = listOf(
            NavigationItem.Home,
            NavigationItem.Group,
            NavigationItem.Setting
        )
        BottomNavigation(backgroundColor = Color.Black, contentColor = Color.White) {
            items.forEach{ item->
                BottomNavigationItem(
                    icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                    label = { Text(text = item.title) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    alwaysShowLabel = true,
                    selected = false,
                    onClick = {
                    }
                )
            }
        }


    }
}
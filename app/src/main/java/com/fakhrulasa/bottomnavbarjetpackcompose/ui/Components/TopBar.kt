package com.fakhrulasa.bottomnavbarjetpackcompose.ui.Components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp
import com.fakhrulasa.bottomnavbarjetpackcompose.R

object TopBar {
    @Composable
    fun TopBar() {
        TopAppBar(
            title = { Text(text = "Bottom Navbar", fontSize = 15.sp) },
            backgroundColor = colorResource(id = R.color.black),
            contentColor = Color.White
        )
    }

}
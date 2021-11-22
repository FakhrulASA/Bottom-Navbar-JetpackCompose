package com.fakhrulasa.bottomnavbarjetpackcompose.ui.Components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.HomeScreenView


@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = "Bottom Navbar", fontSize = 15.sp) },
        backgroundColor = Color.DarkGray,
        contentColor = Color.White
    )
}


@Preview(showBackground = true)
@Composable
fun BooksScreenPreview() {
    TopBar()
}

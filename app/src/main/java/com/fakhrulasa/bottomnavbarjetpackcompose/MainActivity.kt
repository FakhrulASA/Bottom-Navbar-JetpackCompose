package com.fakhrulasa.bottomnavbarjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.fakhrulasa.bottomnavbarjetpackcompose.navigation.Navigation
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.Components.BottomNavigationBar
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.Components.TopBar
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.HomeScreenView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        Navigation(navController)
    }
}


@Preview(showBackground = true)
@Composable
fun topBarPreview() {
    TopBar()
}


@Preview(showBackground = true)
@Composable
fun BooksScreenPreview() {
    HomeScreenView()
}

@Preview(showBackground = true)
@Composable
fun Bottom() {
    val navController = rememberNavController()
    BottomNavigationBar(navController)

}

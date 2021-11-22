package com.fakhrulasa.bottomnavbarjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.GroupScreenView
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.HomeScreenView
import com.fakhrulasa.bottomnavbarjetpackcompose.ui.SettingScreenView

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreenView()
        }
        composable(NavigationItem.Group.route) {
            GroupScreenView()
        }
        composable(NavigationItem.Setting.route) {
            SettingScreenView()
        }

    }
}

package com.example.testting.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testting.view.EntrySiswaScreen
import com.example.testting.view.HomeScreen
import com.example.testting.view.route.DestinasiEntry
import com.example.testting.view.route.DestinasiHome

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController(),
             modifier: Modifier){
    HostNavigasi(navController = navController)
}

@OptIn
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController=navController, startDestination = DestinasiHome.route
        , modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {navController.navigate(
                    DestinasiEntry.
                route)},
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack()})
        }
    }
}
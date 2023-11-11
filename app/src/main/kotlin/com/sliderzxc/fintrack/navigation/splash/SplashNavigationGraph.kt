package com.sliderzxc.fintrack.navigation.splash

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sliderzxc.fintrack.navigation.root.Graph
import com.sliderzxc.fintrack.screens.splash.SplashScreen

fun NavGraphBuilder.splashNavGraph(navController: NavController) {
    navigation(
        route = Graph.SPLASH,
        startDestination = SplashScreen.Main.route
    ) {
        composable(route = SplashScreen.Main.route) {
            SplashScreen {

            }
        }
    }
}

sealed class SplashScreen(val route: String) {
    data object Main : SplashScreen("welcome_screen")
}
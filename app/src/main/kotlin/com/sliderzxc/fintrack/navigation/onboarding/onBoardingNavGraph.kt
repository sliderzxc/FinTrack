package com.sliderzxc.fintrack.navigation.onboarding

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.sliderzxc.fintrack.navigation.root.Graph

fun NavGraphBuilder.onBoardingNavGraph(navController: NavController) {
    navigation(
        route = Graph.ON_BOARDING,
        startDestination = OnBoardingScreen.Welcome.route
    ) {
        composable(route = OnBoardingScreen.Welcome.route) {
//            OnBoardingScreen(
//                popBackStack = {
//                    navController.popBackStack()
//                },
//            )
        }
    }
}

sealed class OnBoardingScreen(val route: String) {
    data object Welcome : OnBoardingScreen("welcome_screen")
}
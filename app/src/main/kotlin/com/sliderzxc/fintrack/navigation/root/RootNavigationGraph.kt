package com.sliderzxc.fintrack.navigation.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sliderzxc.fintrack.navigation.onboarding.onBoardingNavGraph
import com.sliderzxc.fintrack.navigation.splash.splashNavGraph

@Composable
fun RootNavigationGraph(
    navHostController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navHostController,
        route = Graph.ROOT,
        startDestination = startDestination
    ) {
        onBoardingNavGraph(navHostController)
        splashNavGraph(navHostController)
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val MAIN = "main_graph"
    const val ON_BOARDING = "on_boarding_graph"
    const val SPLASH = "splash_graph"
}
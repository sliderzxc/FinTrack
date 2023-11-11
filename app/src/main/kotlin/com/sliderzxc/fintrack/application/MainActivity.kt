package com.sliderzxc.fintrack.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sliderzxc.fintrack.navigation.root.RootNavigationGraph
import com.sliderzxc.fintrack.screens.splash.SplashViewModel
import com.sliderzxc.fintrack.themes.FinTrackTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinTrackTheme {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()
                val startDestination by viewModel.startDestination

                RootNavigationGraph(
                    navHostController = navController,
                    startDestination = startDestination
                )
            }
        }
    }
}
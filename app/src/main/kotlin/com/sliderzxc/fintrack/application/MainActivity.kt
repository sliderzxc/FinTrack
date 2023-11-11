package com.sliderzxc.fintrack.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sliderzxc.fintrack.navigation.RootNavigationGraph
import com.sliderzxc.fintrack.themes.FinTrackStyle
import com.sliderzxc.fintrack.themes.FinTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinTrackTheme {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()

                RootNavigationGraph(
                    navController = navController
                )
            }
        }
    }
}
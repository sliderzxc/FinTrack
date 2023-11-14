package com.sliderzxc.fintrack.features.splash.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sliderzxc.fintrack.features.splash.navigation.SplashComponent

@Composable
fun SplashScreen(
    component: SplashComponent
) {
    // todo val state by component.state.collectAsState()

    Text(text = "Hello Android")
    Log.d("MyLog", "Hello")
}
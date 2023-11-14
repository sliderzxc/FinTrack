package com.sliderzxc.fintrack.features.splash.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SplashScreen(
) {
    Text(text = "Hello Android", modifier = Modifier.background(Color.Black))
    Log.d("MyLog", "Hello")
}
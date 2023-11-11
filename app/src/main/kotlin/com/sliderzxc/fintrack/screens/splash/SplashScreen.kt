package com.sliderzxc.fintrack.screens.splash

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun SplashScreen(
    onNavigateUp: () -> Unit
) {
    Text(text = "Hello Android", modifier = Modifier.background(Color.Black))
    Log.d("MyLog", "Hello")
}
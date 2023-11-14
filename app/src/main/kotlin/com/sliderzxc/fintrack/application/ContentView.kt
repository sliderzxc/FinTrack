package com.sliderzxc.fintrack.application

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sliderzxc.fintrack.navigation.core.RootContent
import com.sliderzxc.fintrack.navigation.root.RootComponent
import com.sliderzxc.fintrack.themes.FinTrackTheme

@Composable
fun ContentView(component: RootComponent) {
    FinTrackTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            RootContent(component)
        }
    }
}
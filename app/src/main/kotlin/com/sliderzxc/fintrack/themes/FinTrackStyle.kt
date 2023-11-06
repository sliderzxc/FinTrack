package com.sliderzxc.fintrack.themes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

object FinTrackStyle {
    val colors: FinTrackColors
        @Composable
        get() = LocalFinTrackColors.current
}

val LocalFinTrackColors = staticCompositionLocalOf<FinTrackColors> {
    error("No colors provided")
}
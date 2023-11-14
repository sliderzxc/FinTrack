package com.sliderzxc.fintrack.navigation.core

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.sliderzxc.fintrack.features.splash.screen.SplashScreen
import com.sliderzxc.fintrack.navigation.root.FinTrackRoot
import com.sliderzxc.fintrack.navigation.root.RootComponent

@Composable
internal fun RootContent(component: RootComponent) {
    Children(
        stack = component.childStack,
        animation = stackAnimation(fade()),
    ) {
        when(val child = it.instance) {
            is FinTrackRoot.Child.Splash -> SplashScreen(child.component)
        }
    }
}
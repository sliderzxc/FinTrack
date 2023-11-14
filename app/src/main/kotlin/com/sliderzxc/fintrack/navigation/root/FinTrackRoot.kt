package com.sliderzxc.fintrack.navigation.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value
import com.sliderzxc.fintrack.features.splash.navigation.SplashComponent

interface FinTrackRoot {

    val childStack: Value<ChildStack<*, Child>>

    sealed class Child {
        data class Splash(val component: SplashComponent) : Child()
    }
}
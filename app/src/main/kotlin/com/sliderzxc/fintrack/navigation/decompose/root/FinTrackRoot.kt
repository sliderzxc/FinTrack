package com.sliderzxc.fintrack.navigation.decompose.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface FinTrackRoot {

    val childStack: Value<ChildStack<*, Child>>

    sealed class Child {
        data class Splash(val component: SplashComponent) : Child()
    }
}

interface SplashComponent {

}
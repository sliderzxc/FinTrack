package com.sliderzxc.fintrack.navigation.decompose.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.sliderzxc.fintrack.navigation.decompose.configuration.FinTackNavConfiguration


class RootComponent internal constructor(
    componentContext: ComponentContext,
    //private val todoMain: (ComponentContext, Consumer<TodoMain.Output>) -> TodoMain,
) : FinTrackRoot, ComponentContext by componentContext {

    private val navigation = StackNavigation<FinTackNavConfiguration>()

    private val stack = childStack(
        source = navigation,
        initialConfiguration = FinTackNavConfiguration.Splash,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        configuration: FinTackNavConfiguration,
        componentContext: ComponentContext
    ): FinTrackRoot.Child {
        return when (configuration) {
            // FinTackNavConfiguration.Splash -> FinTrackRoot.Child.Splash(componentContext)
        }
    }

    override val childStack: Value<ChildStack<*, FinTrackRoot.Child>> = stack

}
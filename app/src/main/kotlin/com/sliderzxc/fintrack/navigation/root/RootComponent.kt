package com.sliderzxc.fintrack.navigation.root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.value.Value
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.sliderzxc.fintrack.features.splash.navigation.SplashComponent
import com.sliderzxc.fintrack.navigation.configuration.FinTrackNavConfiguration


class RootComponent internal constructor(
    componentContext: ComponentContext,
    private val splash: (ComponentContext, (SplashComponent.Output) -> Unit) -> SplashComponent,
) : FinTrackRoot, ComponentContext by componentContext {

    constructor(
        componentContext: ComponentContext,
        storeFactory: StoreFactory,
    ) : this(
        componentContext = componentContext,
        splash = { childContext, output ->
            SplashComponent(
                componentContext = childContext,
                storeFactory = storeFactory,
                output = output
            )
        }
    )

    private val navigation = StackNavigation<FinTrackNavConfiguration>()

    private val stack = childStack(
        source = navigation,
        initialConfiguration = FinTrackNavConfiguration.Splash,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        configuration: FinTrackNavConfiguration,
        componentContext: ComponentContext
    ): FinTrackRoot.Child {
        return when (configuration) {
            FinTrackNavConfiguration.Splash -> FinTrackRoot.Child.Splash(
                splash(
                    componentContext,
                    ::onSplashOutput
                )
            )
        }
    }

    override val childStack: Value<ChildStack<*, FinTrackRoot.Child>> = stack

    private fun onSplashOutput(output: SplashComponent.Output) {
        when(output) {
            SplashComponent.Output.TestOutput -> TODO()
        }
    }
}
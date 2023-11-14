package com.sliderzxc.fintrack.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.arkivanov.decompose.defaultComponentContext
import com.arkivanov.mvikotlin.main.store.DefaultStoreFactory
import com.sliderzxc.fintrack.navigation.root.RootComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val rootComponent = RootComponent(
            componentContext = defaultComponentContext(),
            storeFactory = DefaultStoreFactory(),
        )
        setContent {
            ContentView(component = rootComponent)
            // val navController = rememberNavController()
//                val systemUiController = rememberSystemUiController()
//                val startDestination by viewModel.startDestination
        }
    }
}
package com.sliderzxc.fintrack.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.sliderzxc.fintrack.themes.FinTrackStyle
import com.sliderzxc.fintrack.themes.FinTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinTrackTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = FinTrackStyle.colors.primaryBackground
                ) {
                    Text(
                        text = "Hello Android!",
                        color = FinTrackStyle.colors.primaryText
                    )
                }
            }
        }
    }
}
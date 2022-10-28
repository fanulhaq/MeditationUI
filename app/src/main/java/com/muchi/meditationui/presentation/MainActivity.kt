package com.muchi.meditationui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.muchi.meditationui.presentation.home_screen.HomeScreen
import com.muchi.meditationui.presentation.ui.theme.MeditationUITheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {
                HomeScreen()
            }
        }
    }
}
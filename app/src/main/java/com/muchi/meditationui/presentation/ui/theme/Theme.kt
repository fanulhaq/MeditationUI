package com.muchi.meditationui.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MeditationUITheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
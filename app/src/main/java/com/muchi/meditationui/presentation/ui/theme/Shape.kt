package com.muchi.meditationui.presentation.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.muchi.meditationui.R

@Composable
@ReadOnlyComposable
fun shapes() = Shapes(
    small = RoundedCornerShape(dimensionResource(R.dimen.x4dp)),
    medium = RoundedCornerShape(dimensionResource(R.dimen.x4dp)),
    large = RoundedCornerShape(0.dp)
)
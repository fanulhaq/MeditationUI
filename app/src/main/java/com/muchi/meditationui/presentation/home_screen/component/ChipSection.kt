package com.muchi.meditationui.presentation.home_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import com.muchi.meditationui.R
import com.muchi.meditationui.presentation.ui.theme.ButtonBlue
import com.muchi.meditationui.presentation.ui.theme.DarkerButtonBlue
import com.muchi.meditationui.presentation.ui.theme.TextWhite

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(
                        start = dimensionResource(R.dimen.x15dp),
                        top = dimensionResource(R.dimen.x15dp),
                        bottom = dimensionResource(R.dimen.x15dp)
                    )
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.x10dp)))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(dimensionResource(R.dimen.x15dp))
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}
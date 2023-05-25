package com.muchi.meditationui.presentation.home_screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.muchi.meditationui.R
import com.muchi.meditationui.presentation.ui.theme.ButtonBlue
import com.muchi.meditationui.presentation.ui.theme.LightRed
import com.muchi.meditationui.presentation.ui.theme.TextWhite

@Composable
fun CurrentMeditation(
    color: Color = LightRed
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(dimensionResource(R.dimen.x15dp))
            .clip(RoundedCornerShape(dimensionResource(R.dimen.x10dp)))
            .background(color)
            .padding(horizontal = dimensionResource(R.dimen.x15dp), vertical = dimensionResource(R.dimen.x20dp))
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Daily Thought",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "Meditation • 3-10 min",
                style = MaterialTheme.typography.body1,
                color = TextWhite
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(dimensionResource(R.dimen.x40dp))
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(dimensionResource(R.dimen.x10dp))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(dimensionResource(R.dimen.x16dp))
            )
        }
    }
}
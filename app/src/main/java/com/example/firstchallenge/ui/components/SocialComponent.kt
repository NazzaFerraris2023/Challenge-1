package com.example.firstchallenge.ui.components

import android.media.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.firstchallenge.R
@Composable

fun SocialComponent(numero : Int, modifier: Modifier) {
    // Implementation of the SmallButton goes here
    Button(
        onClick = {},
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(1.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Black
        ),

    ) {

            Icon(
                painter = painterResource(numero),
                contentDescription = null
            )
        }
    }

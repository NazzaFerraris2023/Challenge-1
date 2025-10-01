package com.example.firstchallenge.ui.components


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable

fun SmallButton(text: String,modifier: Modifier) {
    // Implementation of the SmallButton goes here

    Button(
        onClick = {},
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = Color(0xff1f41bb),


        ))
    {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.tertiary
            ),
            fontSize = MaterialTheme.typography.bodySmall.fontSize,
        )
    }
}
package com.example.firstchallenge.ui.components

import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun TitleComponent( text: String) {
    // Implementation of the TitleComponent goes here
    Text(
        text = text,
        modifier = Modifier.width(343.dp),
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.titleLarge.copy(
                color = MaterialTheme.colorScheme.primary
                ),


    )
}
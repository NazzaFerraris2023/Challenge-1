package com.example.firstchallenge.ui.components

import androidx.compose.foundation.layout.width
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp




@Composable
fun SubTitleComponent(text: String) {
    // Implementation of the SubTitleComponent goes here
    Text(
        text = text,
        modifier = Modifier.width(150.dp),
        fontWeight = FontWeight.Bold,
        fontSize = MaterialTheme.typography.bodyMedium.fontSize,
        style = MaterialTheme.typography.titleLarge.copy(
            color = MaterialTheme.colorScheme.secondary
        ),
        textAlign = TextAlign.Center
    )
}
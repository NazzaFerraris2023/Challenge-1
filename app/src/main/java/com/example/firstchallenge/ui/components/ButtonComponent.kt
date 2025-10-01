package com.example.firstchallenge.ui.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.firstchallenge.R

@Composable
fun ButtonComponent(text: String, modifier: Modifier) {
    // Implementation of the ButtonComponent goes here
    Button(
        shape = RoundedCornerShape(10.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xff1f41bb),
        ),
        modifier = modifier
    ) {
        Text(text = text, color = Color.White)
    }
}
package com.example.firstchallenge.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.firstchallenge.ui.components.TitleComponent
import com.example.firstchallenge.R
import com.example.firstchallenge.ui.components.InputComponent
import com.example.firstchallenge.ui.components.SubTitleComponent

import org.w3c.dom.Text

@Composable
fun LoginScreen(modifier: Modifier) {
    // Implementation of the LoginScreen UI goes here
    Column(
        modifier = Modifier,
        verticalArrangement =Arrangement.Top
    ) {
        // Add your UI components here
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ){
            Spacer(modifier = Modifier.height(120.dp))
            TitleComponent(stringResource(R.string.login_title))
            Spacer(modifier = Modifier.height(20.dp))
            SubTitleComponent(stringResource(R.string.login_subtitle))


        }

        Spacer(modifier = Modifier.height(60.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,

        ) {
            InputComponent(
                stringResource(R.string.login_email_input),
                modifier = Modifier.width(300.dp).border(
                    width = 2.dp,
                    color = Color(0xff1f41bb),
                    shape = RoundedCornerShape(10.dp),

                )

            )

            Spacer(modifier = Modifier.height(10.dp))

            InputComponent(
                stringResource(R.string.login_pssw_input),
                modifier = Modifier.width(300.dp).border(
                    width = 2.dp,
                    color = Color(0xff1f41bb),
                    shape = RoundedCornerShape(10.dp),

                    )

            )
        }
        Spacer(modifier = Modifier.height(7.dp))
        Column (
            modifier = Modifier.width(330.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Top
        ){
            Text(
                text = stringResource(R.string.login_forgot),
                textAlign = TextAlign.End,
                style = MaterialTheme.typography.titleLarge.copy(
                    color = MaterialTheme.colorScheme.primary
                ),
                fontSize = MaterialTheme.typography.bodySmall.fontSize,
                fontWeight = FontWeight.Bold

            )
        }
    }
}
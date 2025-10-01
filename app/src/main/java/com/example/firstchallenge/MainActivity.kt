package com.example.firstchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstchallenge.ui.screens.LoginScreen
import com.example.firstchallenge.ui.screens.RegisterScreen
import com.example.firstchallenge.ui.screens.WelcomeScreen
import com.example.firstchallenge.ui.theme.FirstChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstChallengeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   // WelcomeScreen(Modifier.padding(innerPadding))
                    //LoginScreen(Modifier.padding(innerPadding))
                    RegisterScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}


package com.example.checkpoint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import carreiras.com.github.navigation_between_screens.screens.LoginScreen
import androidx.compose.ui.Modifier
import com.example.checkpoint.ui.theme.CHECKPOINTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CHECKPOINTTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    LoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


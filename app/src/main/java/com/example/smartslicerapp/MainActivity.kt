package com.example.smartslicerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.smartslicerapp.screens.MainScreen
import com.example.smartslicerapp.ui.theme.SmartSlicerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartSlicerAppTheme {
                SmartCutApp()
            }
        }
    }
}

@Composable
fun SmartCutApp() {

    MainScreen(
        onNavigateToCubeSlicer = {
            // TODO: Implement cube slicer
        },
        onNavigateToBladeSlicer = {
            // TODO: Implement blade slicer
        },
        onNavigateToRecipes = {
            // TODO: Navigate to recipes
        },
        onNavigateToWeighing = {
            // TODO: Navigate to weighing
        },
        onNavigateToSettings = {
            // TODO: Navigate to settings
        }
    )
}
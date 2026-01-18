package com.example.smartslicerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {

        composable(Screen.Main.route) {
            MainScreen(
                onNavigateToCubeSlicer = {
                    navController.navigate(Screen.CubeSlicer.route)
                },
                onNavigateToBladeSlicer = {
                    navController.navigate(Screen.BladeSlicer.route)
                },
                onNavigateToRecipes = {
                    navController.navigate(Screen.RecipeSelection.route)
                },
                onNavigateToWeighing = {
                    navController.navigate(Screen.WeighingMode.createRoute("Manual", 1))
                },
                onNavigateToSettings = {
                    navController.navigate(Screen.Settings.route)
                }
            )
        }


        composable(Screen.CubeSlicer.route) {
            PlaceholderScreen(
                title = "Нарезка кубиками",
                onBack = { navController.popBackStack() }
            )
        }


        composable(Screen.BladeSlicer.route) {
            PlaceholderScreen(
                title = "Нарезка слайсами",
                onBack = { navController.popBackStack() }
            )
        }


        composable(Screen.RecipeSelection.route) {
            PlaceholderScreen(
                title = "Рецепты",
                onBack = { navController.popBackStack() }
            )
        }

        // Экран настроек
        composable(Screen.Settings.route) {
            PlaceholderScreen(
                title = "Настройки",
                onBack = { navController.popBackStack() }
            )
        }
    }
}

@Composable
fun PlaceholderScreen(title: String, onBack: () -> Unit) {
    Scaffold { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF1A1A1A),
                            Color(0xFF2D2D2D)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42)
                )
                Text(
                    text = "Скоро здесь будет функционал",
                    fontSize = 16.sp,
                    color = Color(0xB3FF8C42)
                )
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    onClick = onBack,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF9B6B)
                    )
                ) {
                    Text(
                        text = "← Назад",
                        fontSize = 18.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}
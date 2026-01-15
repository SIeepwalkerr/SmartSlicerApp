package com.example.smartslicerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartslicerapp.ui.theme.DarkColors
import com.example.smartslicerapp.ui.theme.LightColors
import com.example.smartslicerapp.ui.theme.SmartCutColors
import com.example.smartslicerapp.ui.theme.SmartCutColors.OrangePrimary
import com.example.smartslicerapp.ui.theme.SmartSlicerAppTheme

// Темная тема
private val DarkColorScheme = darkColorScheme(
    primary = DarkColors.primary,
    secondary = DarkColors.secondary,
    tertiary = DarkColors.tertiary,

    background = DarkColors.background,
    surface = DarkColors.surface,
    surfaceVariant = DarkColors.surfaceVariant,

    onPrimary = DarkColors.onPrimary,
    onSecondary = DarkColors.onSecondary,
    onTertiary = Color.White,
    onBackground = DarkColors.onBackground,
    onSurface = DarkColors.onSurface,

    error = DarkColors.error,
    onError = Color.White,

    outline = DarkColors.border,
    outlineVariant = DarkColors.divider
)

// Светлая тема
private val LightColorScheme = lightColorScheme(
    primary = LightColors.primary,
    secondary = LightColors.secondary,
    tertiary = LightColors.tertiary,

    background = LightColors.background,
    surface = LightColors.surface,
    surfaceVariant = LightColors.surfaceVariant,

    onPrimary = LightColors.onPrimary,
    onSecondary = LightColors.onSecondary,
    onTertiary = Color.White,
    onBackground = LightColors.onBackground,
    onSurface = LightColors.onSurface,

    error = LightColors.error,
    onError = Color.White,

    outline = LightColors.border,
    outlineVariant = LightColors.divider
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartSlicerAppTheme {
                Scaffold(
                    containerColor = Color.Transparent,
                    content = { padding ->
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(Color(0xFF1A1A1A),Color(0xFF2D2D2D))
                                    )
                                )
                                .padding(padding)
                        ){
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(600.dp)
                                    .padding(horizontal = 16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFF2A1810)
                                ),
                                shape = RoundedCornerShape(24.dp)
                            ){
                                Column(
                                    modifier = Modifier.padding(32.dp),
                                    horizontalAlignment = CenterHorizontally,
                                    verticalArrangement = Arrangement.SpaceBetween
                                ) {
                                    HeaderSection()
                                    ConnectionStatus(true)
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun HeaderSection(){
    Column(
        horizontalAlignment = CenterHorizontally
    ){
        Text(
            "SmartCut App",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = OrangePrimary
            )
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "application for working with a slicer on an ESP32",
            fontSize = 16.sp,
            color = OrangePrimary,

        )
    }
}
@Composable
fun ConnectionStatus(isConnected: Boolean){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        color = if (isConnected) SmartCutColors.Orange else Color.Gray,
        shape = RoundedCornerShape(12.dp)
    )
    {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = if (isConnected) "✓" else "✕",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            )
            Text(
                text = if (isConnected) "Connected to ESP32" else "Disconnected from ESP32",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White )
                //fontFamily = FontFamily(Font(R.font.jetbrainsmono_medium)) )
        }
    }
}

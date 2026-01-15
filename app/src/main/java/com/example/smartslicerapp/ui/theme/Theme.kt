package com.example.smartslicerapp.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Темная цветовая схема (основная для SmartCut)
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

// Светлая цветовая схема
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

@Composable
fun SmartSlicerAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color доступен на Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
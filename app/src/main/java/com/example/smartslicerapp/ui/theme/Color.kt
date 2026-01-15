package com.example.smartslicerapp.ui.theme

import androidx.compose.ui.graphics.Color

// ============ Основные цвета SmartCut ============

// Оранжевые оттенки (основные)
val OrangePrimary = Color(0xFFFF8C42)
val OrangeSecondary = Color(0xFFFF9B6B)
val OrangeDark = Color(0xFFD87341)
val OrangeLight = Color(0xFFFF9F5C)
val OrangeBright = Color(0xFFFFAA70)

// Коричневые оттенки
val BrownDark = Color(0xFF6B3E26)
val BrownMedium = Color(0xFF8B5A3C)
val BrownLight = Color(0xFFA67C52)
val Terracotta = Color(0xFFE07856)
val BurntOrange = Color(0xFFCC5500)

// Нейтральные темные
val DarkBackground = Color(0xFF1A1A1A)
val DarkBackgroundSecondary = Color(0xFF2D2D2D)
val CardBackgroundDark = Color(0xFF2A1810)
val CardBackgroundDarkSecondary = Color(0xFF3A2420)

// Нейтральные светлые
val LightBackground = Color(0xFFFFF8F0)
val LightBackgroundSecondary = Color(0xFFFFF0E0)
val CardBackgroundLight = Color(0xFFFFFAF5)
val CardBackgroundLightSecondary = Color(0xFFFFF5EB)

// Акцентные цвета
val Green = Color(0xFF4CAF50)
val GreenDark = Color(0xFF45A049)
val Red = Color(0xFFE53935)
val RedDark = Color(0xFFD32F2F)
val Yellow = Color(0xFFFFB300)
val YellowDark = Color(0xFFFFA000)

// Серые оттенки
val Gray100 = Color(0xFFF5F5F5)
val Gray200 = Color(0xFFEEEEEE)
val Gray300 = Color(0xFFE0E0E0)
val Gray400 = Color(0xFFBDBDBD)
val Gray500 = Color(0xFF9E9E9E)
val Gray600 = Color(0xFF757575)
val Gray700 = Color(0xFF616161)
val Gray800 = Color(0xFF424242)
val Gray900 = Color(0xFF212121)

// Прозрачности оранжевого
val OrangeAlpha10 = Color(0x1AFF8C42)
val OrangeAlpha20 = Color(0x33FF8C42)
val OrangeAlpha30 = Color(0x4DFF8C42)
val OrangeAlpha50 = Color(0x80FF8C42)
val OrangeAlpha70 = Color(0xB3FF8C42)

// ============ Темная тема (по умолчанию) ============
object DarkColors {
    val primary = OrangePrimary
    val secondary = OrangeSecondary
    val tertiary = OrangeDark

    val background = DarkBackground
    val surface = CardBackgroundDark
    val surfaceVariant = CardBackgroundDarkSecondary

    val onPrimary = Color.White
    val onSecondary = Color.White
    val onBackground = OrangePrimary
    val onSurface = OrangePrimary

    val success = Green
    val error = Red
    val warning = Yellow

    val textPrimary = OrangePrimary
    val textSecondary = Color(0xB3FF8C42)
    val textTertiary = Color(0x80FF8C42)

    val border = OrangeAlpha30
    val divider = OrangeAlpha20
}

// ============ Светлая тема ============
object LightColors {
    val primary = OrangeDark
    val secondary = OrangePrimary
    val tertiary = OrangeLight

    val background = LightBackground
    val surface = CardBackgroundLight
    val surfaceVariant = CardBackgroundLightSecondary

    val onPrimary = Color.White
    val onSecondary = Color.White
    val onBackground = BrownDark
    val onSurface = BrownDark

    val success = GreenDark
    val error = RedDark
    val warning = YellowDark

    val textPrimary = BrownDark
    val textSecondary = BrownMedium
    val textTertiary = Gray600

    val border = Color(0xFFE0C5B0)
    val divider = Color(0xFFF0E0D0)
}

// ============ Старый object для обратной совместимости ============
object SmartCutColors {
    val DarkBackground = com.example.smartslicerapp.ui.theme.DarkBackground
    val CardBackground = CardBackgroundDark
    val OrangePrimary = com.example.smartslicerapp.ui.theme.OrangePrimary
    val OrangeSecondary = com.example.smartslicerapp.ui.theme.OrangeSecondary
    val OrangeDark = com.example.smartslicerapp.ui.theme.OrangeDark
    val OrangeLight = com.example.smartslicerapp.ui.theme.OrangeLight
    val BrownDark = com.example.smartslicerapp.ui.theme.BrownDark
    val BrownMedium = com.example.smartslicerapp.ui.theme.BrownMedium
    val Terracotta = com.example.smartslicerapp.ui.theme.Terracotta
    val BurntOrange = com.example.smartslicerapp.ui.theme.BurntOrange
    val Orange = OrangeSecondary
}
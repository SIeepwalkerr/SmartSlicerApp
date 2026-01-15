package com.example.smartslicerapp.ui.theme

import androidx.compose.ui.graphics.Color




val OrangePrimary = Color(0xFFFF8C42)
val OrangeSecondary = Color(0xFFFF9B6B)
val OrangeDark = Color(0xFFD87341)

// Коричневые оттенки
val BrownDark = Color(0xFF6B3E26)
val BrownMedium = Color(0xFF8B5A3C)

// Фоны (темная тема)
val DarkBackground = Color(0xFF1A1A1A)
val DarkBackgroundSecondary = Color(0xFF2D2D2D)
val CardBackgroundDark = Color(0xFF2A1810)

// Фоны (светлая тема)
val LightBackground = Color(0xFFFFF8F0)
val CardBackgroundLight = Color(0xFFFFFAF5)


val Green = Color(0xFF4CAF50)
val GreenDark = Color(0xFF45A049)
val Red = Color(0xFFE53935)
val RedDark = Color(0xFFD32F2F)
val Yellow = Color(0xFFFFB300)


val Gray = Color(0xFF757575)
val GrayDark = Color(0xFF424242)
val GrayLight = Color(0xFFBDBDBD)


val OrangeAlpha10 = Color(0x1AFF8C42)
val OrangeAlpha20 = Color(0x33FF8C42)
val OrangeAlpha30 = Color(0x4DFF8C42)
val OrangeAlpha50 = Color(0x80FF8C42)
val OrangeAlpha70 = Color(0xB3FF8C42)


object SmartCutColors {
    // Основные цвета
    val Primary = OrangePrimary
    val Secondary = OrangeSecondary
    val Dark = OrangeDark


    val Background = DarkBackground
    val BackgroundSecondary = DarkBackgroundSecondary
    val CardBackground = CardBackgroundDark


    val Success = Green              // ✅ Подключено
    val Error = Red                  // ❌ Ошибка
    val Warning = Yellow             // ⚠️ Предупреждение
    val Disconnected = Gray          // ⚪ Не подключено


    val Alpha10 = OrangeAlpha10
    val Alpha20 = OrangeAlpha20
    val Alpha30 = OrangeAlpha30
    val Alpha50 = OrangeAlpha50
    val Alpha70 = OrangeAlpha70


    val TextPrimary = OrangePrimary
    val TextSecondary = OrangeAlpha70
    val TextTertiary = OrangeAlpha50
}


object DarkColors {
    val primary = OrangePrimary
    val secondary = OrangeSecondary
    val tertiary = OrangeDark

    val background = DarkBackground
    val surface = CardBackgroundDark

    val onPrimary = Color.White
    val onSecondary = Color.White
    val onBackground = OrangePrimary
    val onSurface = OrangePrimary

    val success = Green
    val error = Red
    val warning = Yellow
}


object LightColors {
    val primary = OrangeDark
    val secondary = OrangePrimary
    val tertiary = OrangeSecondary

    val background = LightBackground
    val surface = CardBackgroundLight

    val onPrimary = Color.White
    val onSecondary = Color.White
    val onBackground = BrownDark
    val onSurface = BrownDark

    val success = GreenDark
    val error = RedDark
    val warning = Yellow
}
package com.example.smartslicerapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartslicerapp.ui.theme.SmartCutColors

@Composable
fun MainScreen(
    onNavigateToCubeSlicer: () -> Unit,
    onNavigateToBladeSlicer: () -> Unit,
    onNavigateToRecipes: () -> Unit,
    onNavigateToWeighing: () -> Unit,
    onNavigateToSettings: () -> Unit
) {
    var isConnected by remember { mutableStateOf(false) }

    Scaffold(
        containerColor = Color.Transparent,
        content = { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFF1A1A1A),
                                Color(0xFF2D2D2D)
                            )
                        )
                    )
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF2A1810)
                    ),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {

                        Text(
                            text = "SmartCut App",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFF8C42)
                        )

                        Text(
                            text = "Выбери режим нарезки",
                            fontSize = 16.sp,
                            color = Color(0xB3FF8C42)
                        )

                        Spacer(modifier = Modifier.height(8.dp))


                        ConnectionStatusButton(
                            isConnected = isConnected,
                            onClick = { isConnected = !isConnected }
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "Режимы нарезки",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFFFF8C42)
                        )

                        ModeButton(
                            icon = "🧊",
                            title = "Нарезка кубиками",
                            description = "Нарежьте продукты кубиками",
                            onClick = onNavigateToCubeSlicer
                        )

                        ModeButton(
                            icon = "🔪",
                            title = "Нарезка слайсами",
                            description = "Нарежьте продукты тонкими ломтиками",
                            onClick = onNavigateToBladeSlicer
                        )

                        ModeButton(
                            icon = "📋",
                            title = "Режим рецептов",
                            description = "Готовить по рецепту с порциями",
                            onClick = onNavigateToRecipes
                        )

                        ModeButton(
                            icon = "⚖️",
                            title = "Режим взвешивания",
                            description = "Точное взвешивание ингредиентов",
                            onClick = onNavigateToWeighing
                        )


                        OutlinedButton(
                            onClick = onNavigateToSettings,
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFFFF8C42)
                            ),
                            border = androidx.compose.foundation.BorderStroke(
                                2.dp,
                                Color(0xFFFF8C42)
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                text = "⚙️ Настройки",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(vertical = 4.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}

@Composable
fun ConnectionStatusButton(
    isConnected: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = if (isConnected) SmartCutColors.Success else SmartCutColors.Disconnected

    Surface(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        color = backgroundColor,
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = if (isConnected) "✓" else "✕",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = if (isConnected) "Подключено к ESP32" else "Отключено от ESP32",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        }
    }
}

@Composable
fun ModeButton(
    icon: String,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF9B6B)
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Surface(
                modifier = Modifier.size(48.dp),
                color = Color(0x33FFFFFF),
                shape = RoundedCornerShape(12.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = icon,
                        fontSize = 24.sp
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = description,
                    fontSize = 14.sp,
                    color = Color(0xCCFFFFFF)
                )
            }
        }
    }
}
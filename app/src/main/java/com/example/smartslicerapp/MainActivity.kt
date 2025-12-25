package com.example.smartslicerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smartslicerapp.ui.theme.SmartSlicerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartSlicerAppTheme {
                Scaffold(
                    content = { padding ->
                        SmartCutHeader(modifier = Modifier.padding(padding))
                    }
                )
            }
        }
    }
}
@Composable
fun SmartCutHeader(modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "SmartCut App",
            modifier = Modifier.padding(70.dp),
            fontSize = 28.sp,
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF9707F4)
        )
        Text(
            text = "приложение для умной нарезки продуктов",
            fontSize = 16.sp,
            color = Color(0xD96E6E6F),
        )
    }
}
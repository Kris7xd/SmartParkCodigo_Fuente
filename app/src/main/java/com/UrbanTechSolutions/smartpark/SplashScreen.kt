package com.UrbanTechSolutions.smartpark

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: androidx.navigation.NavHostController) {
    LaunchedEffect(Unit) {
        delay(2000) // ⏱ Espera 2 segundos
        navController.navigate("login") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("🅿️", fontSize = 64.sp)
            Spacer(Modifier.height(12.dp))
            Text("SmartPark", fontSize = 28.sp, color = MaterialTheme.colorScheme.primary)
        }
    }

}

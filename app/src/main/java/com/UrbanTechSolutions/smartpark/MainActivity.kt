
package com.UrbanTechSolutions.smartpark

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import com.UrbanTechSolutions.smartpark.ui.theme.SmartParkTheme

/**
 * SmartPark - Demo App (Modo Dummy)
 * Ciclo completo de pantallas sin backend real
 * Autor: Cristhian Andrés Burbano Mendoza
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartParkTheme {
                val navController = rememberNavController()

                // 🔹 Definición de las rutas de la app
                NavHost(navController = navController, startDestination = "splash") {
                    composable("splash") { SplashScreen(navController) }
                    composable("login") { LoginScreen(navController) }
                    composable("dashboard") { DashboardScreen(navController) }
                    composable("detail/{id}") { backStackEntry ->
                        val id = backStackEntry.arguments?.getString("id") ?: ""
                        ParkingDetailScreen(navController, id)
                    }
                    composable("reserve/{id}") { backStackEntry ->
                        val id = backStackEntry.arguments?.getString("id") ?: ""
                        ReservationScreen(navController, id)
                    }
                    composable("history") { HistoryScreen(navController) }
                    composable("profile") { ProfileScreen(navController) }
                }
            }
        }
    }
}

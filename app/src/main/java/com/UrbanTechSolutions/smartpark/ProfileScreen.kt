package com.UrbanTechSolutions.smartpark

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Perfil del Usuario", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(16.dp))
        Text("Nombre: Juan Pérez")
        Text("Vehículo: ABC-123")
        Text("Correo: juan@correo.com")
        Spacer(Modifier.height(16.dp))
        Button(onClick = { navController.navigate("login") }) {
            Text("Cerrar Sesión")
        }
    }
}

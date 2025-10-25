package com.UrbanTechSolutions.smartpark

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ParkingDetailScreen(navController: NavHostController, id: String) {
    val parking = dummyParkingList.find { it.id == id }

    parking?.let {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(it.nombre, style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.height(8.dp))
            Text("Dirección: ${it.direccion}")
            Text("Cupos disponibles: ${it.cupos}")
            Text("Precio: ${it.precio}/hora")
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navController.navigate("reserve/${it.id}") }) {
                Text("Reservar")
            }
        }
    } ?: Text("Parqueadero no encontrado.")
}

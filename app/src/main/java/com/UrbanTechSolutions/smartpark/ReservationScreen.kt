package com.UrbanTechSolutions.smartpark

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ReservationScreen(navController: NavHostController, id: String) {
    val parking = dummyParkingList.find { it.id == id }

    var nombre by remember { mutableStateOf("") }
    var vehiculo by remember { mutableStateOf("") }
    var hora by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Confirmar Reserva", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))
        parking?.let {
            Text("Parqueadero: ${it.nombre}")
            Text("Precio: ${it.precio}/hora")
        }
        Spacer(Modifier.height(16.dp))

        OutlinedTextField(value = nombre, onValueChange = { nombre = it }, label = { Text("Nombre") })
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(value = vehiculo, onValueChange = { vehiculo = it }, label = { Text("Vehículo") })
        Spacer(Modifier.height(8.dp))
        OutlinedTextField(value = hora, onValueChange = { hora = it }, label = { Text("Hora estimada") })
        Spacer(Modifier.height(16.dp))

        Button(onClick = { navController.navigate("history") }) {
            Text("Confirmar Reserva")
        }
    }
}

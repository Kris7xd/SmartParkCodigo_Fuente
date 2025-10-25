package com.UrbanTechSolutions.smartpark

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HistoryScreen(navController: NavHostController) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("Historial de Reservas", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(12.dp))
        LazyColumn {
            items(dummyHistory.size) { i ->
                val r = dummyHistory[i]
                Card(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
                ) {
                    Column(Modifier.padding(12.dp)) {
                        Text("Parqueadero: ${r.parqueadero}")
                        Text("Fecha: ${r.fecha}")
                        Text("Costo: ${r.costo}")
                        Text("Estado: ${r.estado}")
                    }
                }
            }
        }
    }
}

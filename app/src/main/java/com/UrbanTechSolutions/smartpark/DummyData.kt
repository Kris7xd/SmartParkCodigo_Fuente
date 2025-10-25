package com.UrbanTechSolutions.smartpark

data class Parking(
    val id: String,
    val nombre: String,
    val direccion: String,
    val estado: String,
    val cupos: Int,
    val precio: String
)

val dummyParkingList = listOf(
    Parking("1", "Parking Centro", "Cra 10 #15-20", "Disponible", 12, "$3.000"),
    Parking("2", "Parqueadero Norte", "Av. 30 #45-12", "Ocupado", 0, "$2.500"),
    Parking("3", "SmartParking Mall", "Calle 80 #25-10", "Reservado", 2, "$3.200"),
    Parking("4", "EcoParking", "Calle 100 #10-05", "Disponible", 8, "$2.800")
)

data class Reserva(
    val parqueadero: String,
    val fecha: String,
    val costo: String,
    val estado: String
)

val dummyHistory = listOf(
    Reserva("Parking Centro", "20/10/2025", "$6.000", "Pagado"),
    Reserva("EcoParking", "18/10/2025", "$2.800", "Pendiente")
)

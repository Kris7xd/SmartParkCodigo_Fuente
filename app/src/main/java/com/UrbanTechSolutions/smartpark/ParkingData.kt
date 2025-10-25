package com.UrbanTechSolutions.smartpark.data

data class Parking(
    val id: String,
    val name: String,
    val available: Int,
    val distance: Int,
    val status: String
)

object DummyParkingRepository {
    val parkings = listOf(
        Parking("1", "Parqueadero Centro", 10, 200, "Disponible"),
        Parking("2", "Mall Norte", 0, 800, "Ocupado"),
        Parking("3", "Plaza Sur", 3, 500, "Reservado")
    )
}
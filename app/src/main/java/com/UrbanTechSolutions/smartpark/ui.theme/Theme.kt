package com.UrbanTechSolutions.smartpark.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val SmartParkColorScheme = lightColorScheme(
    primary = GreenPrimary,
    secondary = YellowReserved,
    tertiary = RedBusy,
    background = LightBackground,
    surface = GrayLight,
    onPrimary = Color.White,
    onBackground = DarkText
)

@Composable
fun SmartParkTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = SmartParkColorScheme,
        typography = Typography(),
        content = content
    )
}

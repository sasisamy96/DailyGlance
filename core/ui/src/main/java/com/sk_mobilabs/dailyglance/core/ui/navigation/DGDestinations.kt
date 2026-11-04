package com.sk_mobilabs.dailyglance.core.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.filled.Note
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DGDestination(val route: String, val title: String, val icon: ImageVector) {
    data object Dashboard : DGDestination("dashboard", "Dashboard", Icons.Filled.Dashboard)
    data object Weather : DGDestination("weather", "Weather", Icons.Filled.WbSunny)
    data object News : DGDestination("news", "News", Icons.AutoMirrored.Filled.Article)
    data object Tasks : DGDestination("tasks", "Tasks", Icons.Filled.CheckCircle)
    data object Expenses : DGDestination("expenses", "Expenses", Icons.Filled.AttachMoney)
    data object AI : DGDestination("ai", "AI Assistant", Icons.Filled.SmartToy)
    data object Notes : DGDestination("notes", "Notes", Icons.AutoMirrored.Filled.Note)
    data object Settings : DGDestination("settings", "Settings", Icons.Filled.Settings)
}

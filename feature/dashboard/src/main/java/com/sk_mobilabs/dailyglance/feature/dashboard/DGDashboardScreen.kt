package com.sk_mobilabs.dailyglance.feature.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGCard
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGIcon
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGScaffold
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGText
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGTopBar
import com.sk_mobilabs.dailyglance.core.ui.navigation.DGDestination

@Composable
fun DGDashboardScreen(
    navController: NavHostController,
    onNavigateTo: (String) -> Unit,
) {
    val cards = listOf(
        DGDestination.Weather,
        DGDestination.News,
        DGDestination.Tasks,
        DGDestination.Expenses,
        DGDestination.AI,
        DGDestination.Notes,
    )

    DGScaffold(topBar = { DGTopBar("Daily Glance") }) { padding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(cards) { destination ->
                DGCard(onClick = { onNavigateTo(destination.route) }) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        DGIcon(
                            imageVector = destination.icon,
                            contentDescription = destination.title,
                            size = 32.dp,
                        )
                        DGText(
                            text = destination.title,
                            style = MaterialTheme.typography.titleMedium,
                        )
                    }
                }
            }
        }
    }
}

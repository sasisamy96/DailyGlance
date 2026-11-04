package com.sk_mobilabs.dailyglance.feature.news

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGScaffold
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGText
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGTopBar

@Composable
fun DGNewsScreen(navController: NavController) {
    DGScaffold(topBar = { DGTopBar("News") }) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center,
        ) {
            DGText("News — coming soon")
        }
    }
}

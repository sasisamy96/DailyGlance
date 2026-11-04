package com.sk_mobilabs.dailyglance.feature.notes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGScaffold
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGText
import com.sk_mobilabs.dailyglance.core.designsystem.component.DGTopBar

@Composable
fun DGNotesScreen() {
    DGScaffold(topBar = { DGTopBar("Notes") }) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentAlignment = Alignment.Center,
        ) {
            DGText("Notes — coming soon")
        }
    }
}

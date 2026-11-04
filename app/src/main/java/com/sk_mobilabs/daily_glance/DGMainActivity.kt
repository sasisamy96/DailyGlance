package com.sk_mobilabs.daily_glance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sk_mobilabs.dailyglance.core.designsystem.theme.DGTheme
import com.sk_mobilabs.dailyglance.core.ui.navigation.DGDestination
import com.sk_mobilabs.dailyglance.feature.ai.DGAIScreen
import com.sk_mobilabs.dailyglance.feature.dashboard.DGDashboardScreen
import com.sk_mobilabs.dailyglance.feature.expenses.DGExpensesScreen
import com.sk_mobilabs.dailyglance.feature.news.DGNewsScreen
import com.sk_mobilabs.dailyglance.feature.notes.DGNotesScreen
import com.sk_mobilabs.dailyglance.feature.tasks.DGTasksScreen
import com.sk_mobilabs.dailyglance.feature.weather.DGWeatherScreen
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class DGMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Timber.i("MainActivity created")
        setContent {
            DGTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    DGApp()
                }
            }
        }
    }
}

@Composable
fun DGApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = DGDestination.Dashboard.route,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(700),
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(750),
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(750),
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(750),
            )
        },
    ) {
        composable(route = DGDestination.Dashboard.route) {
            DGDashboardScreen(navController) { route ->
                navController.navigate(route)
            }
        }
        composable(DGDestination.Weather.route) {
            DGWeatherScreen(navController)
        }
        composable(DGDestination.News.route) {
            DGNewsScreen(navController)
        }
        composable(DGDestination.Tasks.route) {
            DGTasksScreen()
        }
        composable(DGDestination.Expenses.route) {
            DGExpensesScreen()
        }
        composable(DGDestination.AI.route) {
            DGAIScreen()
        }
        composable(DGDestination.Notes.route) {
            DGNotesScreen()
        }
    }
}

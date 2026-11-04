plugins {
    id("dailyglance.android.library")
    id("dailyglance.android.compose")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.core.designsystem"
}

dependencies{
    debugImplementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.ui.tooling.preview)
}

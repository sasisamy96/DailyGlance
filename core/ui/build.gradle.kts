plugins {
    id("dailyglance.android.library")
    id("dailyglance.android.compose")
    id("dailyglance.android.hilt")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.core.ui"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:designsystem"))
    implementation(libs.androidx.navigation.compose)
    implementation(libs.hilt.navigation.compose)
    implementation(libs.coil.compose)
    implementation(libs.androidx.compose.material.icons.extended.android)

}
plugins {
    id("dailyglance.android.feature")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.feature.ai"
}

dependencies {
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.ui)
}
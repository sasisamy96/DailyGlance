plugins {
    id("dailyglance.android.feature")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.feature.weather"
}

dependencies {
    implementation(libs.androidx.activity.compose)
}
plugins {
    id("dailyglance.android.feature")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.feature.widgets"
}

dependencies {
    implementation(libs.androidx.glance.appwidget)
    implementation(libs.androidx.glance.material3)
    implementation(libs.androidx.work.runtime.ktx)
}
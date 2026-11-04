plugins {
    id("dailyglance.android.feature")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.feature.tasks"
}

dependencies {
    implementation(libs.play.services.location)
    implementation(libs.androidx.work.runtime.ktx)
}
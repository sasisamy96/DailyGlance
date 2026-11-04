plugins {
    id("dailyglance.android.feature")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.feature.news"
}

dependencies {
    implementation(libs.paging.compose)
}
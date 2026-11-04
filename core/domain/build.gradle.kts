plugins {
    id("dailyglance.android.library")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.sk_mobilabs.dailyglance.core.domain"
}

dependencies {
    implementation(project(":core:common"))
    implementation(libs.javax.inject)
    implementation(libs.androidx.paging.runtime)
    implementation(libs.kotlinx.serialization.json)
}
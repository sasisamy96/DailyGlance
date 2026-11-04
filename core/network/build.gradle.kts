plugins {
    id("dailyglance.android.library")
    id("dailyglance.android.hilt")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.sk_mobilabs.dailyglance.core.network"
}

dependencies {
    implementation(project(":core:common"))
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.client.logging)
    implementation(libs.ktor.client.auth)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.timber)
}
plugins {
    id("dailyglance.android.library")
    id("dailyglance.android.hilt")
}

android {
    namespace = "com.sk_mobilabs.dailyglance.core.database"
}

dependencies {
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore)
    implementation(libs.androidx.security.crypto)
}
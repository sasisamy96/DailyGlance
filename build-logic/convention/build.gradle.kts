plugins {
    `kotlin-dsl`
}

group = "com.sk_mobilabs.dailyglance.buildlogic"

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.ksp.gradle.plugin)
    implementation(libs.hilt.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "dailyglance.android.library"
            implementationClass = "com.sk_mobilabs.dailyglance.buildlogic.AndroidLibraryConventionPlugin"
        }
        register("androidCompose") {
            id = "dailyglance.android.compose"
            implementationClass = "com.sk_mobilabs.dailyglance.buildlogic.AndroidComposeConventionPlugin"
        }
        register("androidHilt") {
            id = "dailyglance.android.hilt"
            implementationClass = "com.sk_mobilabs.dailyglance.buildlogic.AndroidHiltConventionPlugin"
        }
        register("androidFeature") {
            id = "dailyglance.android.feature"
            implementationClass = "com.sk_mobilabs.dailyglance.buildlogic.AndroidFeatureConventionPlugin"
        }
    }
}
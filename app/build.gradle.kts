@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

android {
    namespace = "com.sliderzxc.fintrack"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sliderzxc.fintrack"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures.compose = true
    composeOptions.kotlinCompilerExtensionVersion = "1.5.3"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // AndroidX
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle.runtime)
    // Jetpack Compose
    platform(libs.compose.bom).let { bom ->
        implementation(bom)
        androidTestImplementation(bom)
        debugImplementation(bom)
    }
    implementation(libs.compose.ui.core)
    implementation(libs.compose.ui.tooling)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.activity)
    implementation(libs.compose.material3)
    implementation(libs.compose.navigation)
    implementation(libs.compose.systemuicontroller)
    // Koin
    implementation(platform(libs.koin.bom))
    implementation(libs.koin.compose)
}
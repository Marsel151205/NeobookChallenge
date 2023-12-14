plugins {

    // Android Library
    id(Plugins.androidLibrary)

    // Kotlin Android
    id(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = Presentation.namespace
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk

        testInstrumentationRunner = Config.testInstrumentationRunner
        consumerProguardFiles(Config.consumerProguardFiles)
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
    kotlinOptions {
        jvmTarget = Config.targetJvm
    }
    buildFeatures {

        // View Binding
        viewBinding = true
    }
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // AppCompat
    implementation(Dependencies.UI.appCompat)

    // Material Design
    implementation(Dependencies.UI.material)

    // ConstraintLayout
    implementation(Dependencies.UI.constraintLayout)

    // JUnit
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.testJUnit)

    // EspressoCore
    androidTestImplementation(Dependencies.EspressoCore.espressoCore)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBinding.viewBindingPropertyDelegate)

    // ViewModel
    implementation(Dependencies.Lifecycle.viewModel)

    // LiveData
    implementation(Dependencies.Lifecycle.lifecycleRuntime)

    // Lifecycle
    implementation(Dependencies.Lifecycle.lifecycleRuntime)

    // Paging
    implementation(Dependencies.Paging.paging3)

    // Glide
    implementation(Dependencies.Glide.glide)

    // Navigation Component
    implementation(Dependencies.NavigationComponent.navigationUI)
    implementation(Dependencies.NavigationComponent.navigationFragment)

    // Hilt
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltCompiler)

    // Domain
    implementation(project(":domain"))

    implementation("androidx.cardview:cardview:1.0.0")
}
kapt {
    correctErrorTypes = true
}
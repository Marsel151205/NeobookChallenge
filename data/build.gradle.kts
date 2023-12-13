plugins {

    // Android Library
    id(Plugins.androidLibrary)

    // Kotlin Android
    id(Plugins.kotlinAndroid)
}

android {
    namespace = Data.nameSpace
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.targetJvm
    }
}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    // JUnit
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.testJUnit)

    // EspressoCore
    androidTestImplementation(Dependencies.EspressoCore.espressoCore)
}
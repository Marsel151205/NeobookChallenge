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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
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

    // Hilt
    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.hiltCompiler)

    // Domain
    implementation(project(":domain"))

    // Room
    implementation(Dependencies.Room.roomRuntime)
    kapt(Dependencies.Room.roomCompiler)

    // Gson
    implementation(Dependencies.Gson.gson)

    // Retrofit
    implementation(Dependencies.Retrofit.retrofit)

    // OkHttp
    implementation(Dependencies.OkHttp.okHttp)

    // Logging Interceptor
    implementation(Dependencies.Interceptors.loggingInterceptor)
}
kapt{
    correctErrorTypes = true
}
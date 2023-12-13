object Version {
    const val androidApplication = "8.1.2"
    const val kotlinAndroid = "1.9.0"
    const val androidLibrary = "8.1.2"
    const val kotlinJvm = "1.9.0"
    const val core = "1.9.0"
    const val appCompat = "1.6.1"
    const val material = "1.10.0"
    const val constraintLayout = "2.1.4"
    const val jUnit = "4.13.2"
    const val extJUnit = "1.1.5"
    const val espressoCore = "3.5.1"
    const val retrofit = "2.9.0"
    const val okHttp = "4.11.0"
    const val hilt = "2.48"
    const val navigationComponent = "2.7.5"
    const val glide = "4.16.0"
    const val paging3 = "3.2.1"
    const val coroutines = "1.3.9"
    const val viewBindingPropertyDelegate = "1.5.9"
    const val lifecycle = "2.6.2"
    const val loggingInterceptor = "4.11.0"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val androidLibrary = "com.android.library"
    const val kotlinJvm = "org.jetbrains.kotlin.jvm"
    const val javaLibrary = "java-library"
    const val hilt = "com.google.dagger.hilt.android"
    const val kapt = "kapt"
}

object Dependencies {

    object Core {
        const val core = "androidx.core:core-ktx:${Version.core}"
    }

    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val material = "com.google.android.material:material:${Version.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    }

    object Test {
        const val jUnit = "junit:junit:${Version.jUnit}"
        const val testJUnit = "androidx.test.ext:junit:${Version.extJUnit}"
    }

    object EspressoCore {
        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.espressoCore}"
    }

    object Gson {
        const val gson = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    }

    object OkHttp {
        const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
    }

    object NavigationComponent {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment:${Version.navigationComponent}"
        const val navigationUI = "androidx.navigation:navigation-ui:${Version.navigationComponent}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    }

    object Paging {
        const val paging3 = "androidx.paging:paging-runtime:${Version.paging3}"
    }

    object Coroutines {
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
    }

    object ViewBinding {
        const val viewBindingPropertyDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Version.viewBindingPropertyDelegate}"
    }

    object Lifecycle {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
    }

    object Interceptors {
        const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Version.loggingInterceptor}"
    }
}
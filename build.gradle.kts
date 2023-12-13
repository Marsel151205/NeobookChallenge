// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Android Application
    id(Plugins.androidApplication) version Version.androidApplication apply false

    // Kotlin Android
    id(Plugins.kotlinAndroid) version Version.kotlinAndroid apply false

    // Android Library
    id(Plugins.androidLibrary) version Version.androidLibrary apply false

    // Kotlin Jvm
    id(Plugins.kotlinJvm) version Version.kotlinJvm apply false

    // Hilt
    id(Plugins.hilt) version Version.hilt apply false
}
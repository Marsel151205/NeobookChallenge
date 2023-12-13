plugins {
    // Java Library
    id(Plugins.javaLibrary)

    // Kotlin Jvm
    id(Plugins.kotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    // Coroutines
    api(Dependencies.Coroutines.coroutines)
}
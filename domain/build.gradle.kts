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

    implementation("javax.inject:javax.inject:1")

    // Coroutines
    implementation(Dependencies.Coroutines.coroutines)
    implementation(Dependencies.Coroutines.coroutineCore)
    implementation(Dependencies.Coroutines.coroutineCoreJVM)
}
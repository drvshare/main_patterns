plugins {
    kotlin("jvm") apply false
}

group = "ru.drvshare.main_patterns"
version = "0.0.1-SNAPSHOT"

allprojects {
repositories {
        google()
    mavenCentral()
        maven { url = uri("https://jitpack.io") }
}
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}

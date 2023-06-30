plugins {
    kotlin("jvm")
}

kotlin {
    sourceSets {
        @Suppress("UNUSED_VARIABLE")
        val main by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation(kotlin("stdlib-jdk8"))
            }
            @Suppress("UNUSED_VARIABLE")
            val test by getting {
                dependencies {
                    implementation(kotlin("test-junit"))
                }
            }
        }
    }
}

plugins {
    java
}

group = "com.cache"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:26.0.2")
    implementation("it.unimi.dsi:fastutil:8.5.15")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

sourceSets {
    main {
        java {
            srcDirs("src")
            srcDirs("src/com/")
       }
    }
}
plugins {
    kotlin("jvm") version "2.2.20"
    application
}

group = "kotlin.study"
version = "0.1.0"

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

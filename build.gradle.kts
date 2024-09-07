import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    kotlin("jvm") version("2.0.0")
    kotlin("plugin.serialization") version("2.0.0")
}

group = "me.elephant1214.alphaserver"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.ktor:ktor-network:2.3.12")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
    implementation("it.unimi.dsi:fastutil:8.5.13")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
        options.release = 21
    }
    withType<KotlinCompile>().configureEach {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
            freeCompilerArgs.addAll(
                "-opt-in=kotlin.ExperimentalUnsignedTypes",
                "-opt-in=kotlin.io.path.ExperimentalPathApi",
                "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            )
        }
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
}

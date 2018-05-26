import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    var kotlinVersion: String by extra
    kotlinVersion = "1.2.41"

    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", kotlinVersion))
    }
}

plugins {
    java
}

group = "com.knkengravings"
version = "1.0-SNAPSHOT"

apply {
    plugin("kotlin")
}

val kotlinVersion: String by extra

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlin("stdlib-jdk8", kotlinVersion))
    compile("org.jetbrains.kotlinx:kotlinx-html:0.6.10")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
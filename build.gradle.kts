buildscript {
    repositories {
        mavenCentral()
    }
    //必须添加
    dependencies {
        classpath ("com.github.dcendents:android-maven-gradle-plugin:2.1")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0-rc03" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.android.library") version "8.2.0-rc03" apply false
}
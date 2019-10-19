// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.6.0-beta01")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.3.50")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
            content {
                includeGroup("com.squareup.picasso")
            }
        }
        google()
        mavenCentral()
        jcenter()
    }
}

task("clean") {
    delete(rootProject.buildDir)
}

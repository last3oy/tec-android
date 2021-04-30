plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("kotlinx-serialization")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.last3oy.tecandroid"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    dataBinding {
        isEnabled = true
    }

    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.50")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.0.1")

    // android
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.appcompat:appcompat-resources:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.1.0-beta05")
    implementation("androidx.palette:palette:1.0.0")
    implementation("com.google.android.material:material:1.1.0-beta01")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.2.0-beta01")
    implementation("androidx.lifecycle:lifecycle-livedata:2.2.0-beta01")
    implementation("androidx.room:room-runtime:2.2.0")

    kapt("androidx.lifecycle:lifecycle-compiler:2.2.0-beta01")
    kapt("androidx.room:room-compiler:2.2.0")

    // retrofit
    implementation("com.squareup.retrofit2:retrofit:2.6.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.4.0")
    implementation("com.squareup.okhttp3:logging-interceptor:3.9.1")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:1.0.0")

    // moshi
    implementation("com.squareup.moshi:moshi-kotlin:1.6.0")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.6.0")

    // dagger
    implementation("com.google.dagger:dagger:2.24")
    implementation("com.google.dagger:dagger-android-support:2.24")

    kapt("com.google.dagger:dagger-android-processor:2.24")

    // picasso
    implementation("com.squareup.picasso:picasso:3.0.0-SNAPSHOT")

    // unit test
    testImplementation("junit:junit:4.12")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation("androidx.room:room-testing:2.2.0")

    // instrumented test
    androidTestImplementation("androidx.test:runner:1.3.0-alpha02")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0-alpha02")
}

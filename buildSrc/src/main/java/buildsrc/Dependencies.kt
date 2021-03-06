@file:Suppress("MayBeConstant")

package buildsrc

@Suppress("unused")
object BuildConfig {
  val buildTools = "28.0.3"
  val minSdk = 17
  val targetSdk = 28
  val compileSdk = 28
}

object Versions {

  object AndroidX {
    val appcompat = "1.0.0"
    val browser = "1.0.0"
    val constraint_layout = "1.1.3"
    val core_ktx = "1.0.0"
    val lifecycle = "2.0.0"
    val paging = "2.0.0"
    val recyclerview = "1.0.0"
    val work = "1.0.0-alpha10"

    object Test {
      val core = "1.0.0"
      val espresso = "3.1.0"
      val junit = "1.0.0"
      val runner = "1.1.0"
      val rules = "1.1.0"
    }
  }

  object Gradle {
    val android = "3.2.1"
    val fabric = "1.26.1"
    val google_services = "4.2.0"
  }

  val android_job = "1.2.6"
  val anko = "0.10.7"
  val coroutines = "1.0.0"
  val crashlytics = "2.9.5@aar"
  val dagger = "2.19"
  val epoxy = "3.0.0-rc1"
  val eventbus = "3.1.1"
  val firebase_core = "16.0.4"
  val firebase_perf = "16.2.0"
  val glide = "4.8.0"
  val kotlin = "1.3.0"
  @Suppress("unused") val ktlint = "0.29.0"
  val leakcanary = "1.6.2"
  val material_design = "1.0.0"
  val material_dialogs = "2.0.0-beta4"
  val mockito = "2.22.0" // Pinning this due to https://github.com/mockito/mockito/issues/1511
  val mockito_kotlin = "2.0.0"
  val moshi = "1.7.0"
  val mvrx = "0.6.0"
  val okhttp = "3.11.0"
  val okio = "2.0.0" // Pinning this due to https://github.com/square/okio/issues/516
  val retrofit = "2.4.0"
  val robolectric = "4.0.1"
  val rxandroid = "2.1.0"
  val rxjava = "2.2.3"
  val rxkotlin = "2.3.0"
  val rxlint = "1.7.0"
  val simple_stack = "1.13.0"
  val threetenabp = "1.1.1"
  val timber = "4.7.1"
}

@Suppress("unused")
object Libraries {

  object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
    val browser = "androidx.browser:browser:${Versions.AndroidX.browser}"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraint_layout}"
    val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.core_ktx}"
    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.lifecycle}"
    val lifecycle_reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.AndroidX.lifecycle}"
    val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifecycle}"
    val paging_runtime = "androidx.paging:paging-runtime:${Versions.AndroidX.paging}"
    val paging_rxjava = "androidx.paging:paging-rxjava2:${Versions.AndroidX.paging}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerview}"
    val work = "android.arch.work:work-runtime-ktx:${Versions.AndroidX.work}"

    object Test {
      val core = "androidx.test:core:${Versions.AndroidX.Test.core}"
      val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidX.Test.espresso}"
      val junit = "androidx.test.ext:junit:${Versions.AndroidX.Test.junit}"
      val runner = "androidx.test:runner:${Versions.AndroidX.Test.runner}"
      val rules = "androidx.test:rules:${Versions.AndroidX.Test.rules}"
    }
  }

  object Gradle {
    val android = "com.android.tools.build:gradle:${Versions.Gradle.android}"
    val fabric = "io.fabric.tools:gradle:${Versions.Gradle.fabric}"
    val google_services = "com.google.gms:google-services:${Versions.Gradle.google_services}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  }

  val android_job = "com.evernote:android-job:${Versions.android_job}"
  val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
  val anko_design = "org.jetbrains.anko:anko-design:${Versions.anko}"
  val anko_sdk15_listeners = "org.jetbrains.anko:anko-sdk15-listeners:${Versions.anko}"
  val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
  val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
  val coroutines_rx = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.coroutines}"
  val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"
  val dagger = "com.google.dagger:dagger:${Versions.dagger}"
  val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
  val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
  val epoxy_databinding = "com.airbnb.android:epoxy-databinding:${Versions.epoxy}"
  val epoxy_paging = "com.airbnb.android:epoxy-paging:${Versions.epoxy}"
  val epoxy_processor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"
  val eventbus = "org.greenrobot:eventbus:${Versions.eventbus}"
  val firebase_core = "com.google.firebase:firebase-core:${Versions.firebase_core}"
  val firebase_perf = "com.google.firebase:firebase-perf:${Versions.firebase_perf}"
  val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
  val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"
  val leakcanary_no_op = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakcanary}"
  val material_design = "com.google.android.material:material:${Versions.material_design}"
  val material_dialogs = "com.afollestad.material-dialogs:core:${Versions.material_dialogs}"
  val mockito = "org.mockito:mockito-core:${Versions.mockito}"
  val mockito_android = "org.mockito:mockito-android:${Versions.mockito}"
  val mockito_kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockito_kotlin}"
  val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
  val moshi_codegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
  val mvrx = "com.airbnb.android:mvrx:${Versions.mvrx}"
  val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
  val okio = "com.squareup.okio:okio:${Versions.okio}"
  val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  val retrofit_rxjava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
  val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
  val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
  val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
  val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
  val rxlint = "nl.littlerobots.rxlint:rxlint:${Versions.rxlint}"
  val simple_stack = "com.github.Zhuinden:simple-stack:${Versions.simple_stack}"
  val threetenabp = "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabp}"
  val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}
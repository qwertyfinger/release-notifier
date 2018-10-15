# This is a configuration file for ProGuard.
# https://www.guardsquare.com/en/products/proguard/manual/usage

# Print final merged ProGuard configurations in the following file.
-printconfiguration build/outputs/mapping/configuration.txt

# Disable optimizations that are known to cause problems.
-optimizations !code/allocation/variable,!method/removal/parameter

# Repackage all classes to save some space.
-repackageclasses ''

# *** LEAKCANARY ***
-keepclassmembers class org.eclipse.mat.** { *; }
-keepclassmembers class com.squareup.leakcanary.** { *; }

# *** CRASHLYTICS ***
-keepattributes SourceFile, LineNumberTable
-keepclassmembers public class * extends java.lang.Exception
-keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**
-renamesourcefileattribute SourceFile

# *** EVENTBUS ***
# Keep methods subscribed for the EventBus callbacks.
-keepclassmembers class ** {
    @org.greenrobot.eventbus.Subscribe <methods>;
}
-keepclassmembers enum org.greenrobot.eventbus.ThreadMode { *; }
# Only required if you use AsyncExecutor.
-keepclassmembers class * extends org.greenrobot.eventbus.util.ThrowableFailureEvent {
    <init>(java.lang.Throwable);
}

# *** DAGGER ***
-dontwarn com.google.errorprone.annotations.**

# *** GLIDE ***
-keepclassmembers public class * implements com.bumptech.glide.module.GlideModule
-keepclassmembers public class * extends com.bumptech.glide.module.AppGlideModule
-keepclassmembers public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}

# *** JSR 305 – ignore annotations for embedding nullability information. ***
-dontwarn javax.annotation.**

# *** OKIO ***
-dontwarn okio.**

# *** OKHTTP ***
-dontwarn okhttp3.**
# A resource is loaded with a relative path so the package of this class must be preserved.
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase

# Animal Sniffer compileOnly dependency to ensure APIs are compatible with older versions of Java.
-dontwarn org.codehaus.mojo.animal_sniffer.*

# OkHttp platform used only on JVM and when Conscrypt dependency is available.
-dontwarn okhttp3.internal.platform.ConscryptPlatform

# *** RETROFIT ***
# Retrofit does reflection on generic parameters and InnerClass is required to use Signature.
-keepattributes Exceptions

# Retain service method parameters when optimizing.
-keepclassmembers,allowshrinking,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}

# Ignore annotation used for build tooling.
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement

# Guarded by a NoClassDefFoundError try/catch and only used when on the classpath.
-dontwarn kotlin.Unit

# Top-level functions that can only be used by Kotlin.
-dontwarn retrofit2.-KotlinExtensions

-dontnote retrofit2.Platform
-dontwarn retrofit2.Platform$Java8

# *** MOSHI ***
-keepclasseswithmembers class * {
    @com.squareup.moshi.* <methods>;
}
-keep @com.squareup.moshi.JsonQualifier interface *

# Enum field names are used by the integrated EnumJsonAdapter.
# Annotate enums with @JsonClass(generateAdapter = false) to use them with Moshi.
-keepclassmembers @com.squareup.moshi.JsonClass class * extends java.lang.Enum {
    <fields>;
}

# The name of @JsonClass types is used to look up the generated adapter.
-keepnames @com.squareup.moshi.JsonClass class *

# Retain generated JsonAdapters if annotated type is retained.
-if @com.squareup.moshi.JsonClass class *
-keep class <1>JsonAdapter {
    <init>(...);
    <fields>;
}

-keep class kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoaderImpl
-keepclassmembers class kotlin.Metadata {
    public <methods>;
}
-keepclassmembers class * {
    @com.squareup.moshi.FromJson <methods>;
    @com.squareup.moshi.ToJson <methods>;
}
-keepnames @kotlin.Metadata class com.example.model.**
-keep class com.example.model.** { *; }
-keepclassmembers class com.example.model.** { *; }

# *** MVRX ***
# BaseMvRxViewModels loads the Companion class via reflection and thus we need to make sure we keep
# the name of the Companion object.
-keepclassmembers class ** extends com.airbnb.mvrx.BaseMvRxViewModel {
    ** Companion;
}

# Classes extending BaseMvRxViewModel are recreated using reflection, which assumes that a one argument
# constructor accepting a data class holding the state exists. Need to make sure to keep the constructor
# around. Additionally, a static create method will be generated in the case a companion object factory
# is used. This is accessed via reflection.
-keepclassmembers class ** extends com.airbnb.mvrx.BaseMvRxViewModel {
    public <init>(...);
    public static *** create(...);
}

# Need to keep class name due to kotlin-reflect
-keep interface com.airbnb.mvrx.MvRxState
# !! Tweak this once https://issuetracker.google.com/issues/112386012 is fixed !!
# Need to keep class name due to kotlin-reflect
-keep class * implements com.airbnb.mvrx.MvRxState { *; }

# *** KOTLIN ***
# Kotlin classes with @Parcelize
-dontwarn com.example.model.**

# Coroutines
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# Kotlin Reflect internal impl
-keep public class kotlin.reflect.jvm.internal.impl.builtins.* { public *; }

# Strip out Kotlin runtime null checks
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
  static void checkParameterIsNotNull(java.lang.Object, java.lang.String);
}
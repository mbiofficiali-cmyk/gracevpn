pluginManagement {
    repositories {
        // آینه‌ها برای پلاگین‌ها
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven-central.storage-download.googleapis.com/maven2")
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        // آینه‌ها برای وابستگی‌ها
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/jcenter") // برای بعضی قدیمی‌ها
        maven("https://maven-central.storage-download.googleapis.com/maven2")
        google()
        mavenCentral()
    }
}

rootProject.name = "GraceVPN"
include(":app")

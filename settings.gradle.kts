pluginManagement {
    repositories {
        // آینه‌ها (برای مواقعی که dl.google.com بسته است)
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven-central.storage-download.googleapis.com/maven2")
        // ریپوهای اصلی
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        // آینه‌ها
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/jcenter")
        maven("https://maven-central.storage-download.googleapis.com/maven2")
        // ریپوهای اصلی
        google()
        mavenCentral()
    }
}

rootProject.name = "GraceVPN"
include(":app")

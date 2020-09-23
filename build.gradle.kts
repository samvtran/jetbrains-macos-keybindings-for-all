import org.jetbrains.changelog.closure
import org.jetbrains.changelog.markdownToHTML

plugins {
    id("org.jetbrains.intellij") version "0.4.26"
    id("org.jetbrains.changelog") version "0.5.0"
}

val pluginGroup: String by project
val pluginName_: String by project
val pluginVersion: String by project

val platformVersion: String by project

group = pluginGroup
version = pluginVersion

buildscript {
    repositories {
        // Workaround: https://github.com/JetBrains/gradle-intellij-plugin/issues/537
        maven("https://jetbrains.bintray.com/intellij-plugin-service")
    }
}

repositories {
    mavenCentral()
    jcenter()
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    pluginName = pluginName_
    version = platformVersion
    updateSinceUntilBuild = false
}

tasks {
    // Set the compatibility versions to 1.8
    withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    patchPluginXml {
        changeNotes(
                closure {
                    changelog.getLatest().toHTML()
                }
        )
    }

    publishPlugin {
        dependsOn("patchChangelog")
        token(System.getenv("INTELLIJ_PUBLISH_TOKEN"))
        channels(pluginVersion.split('-').getOrElse(1) { "default" }.split('.').first())
    }
}

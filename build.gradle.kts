
import org.jetbrains.intellij.tasks.PublishTask

plugins {
    id("org.jetbrains.intellij") version "0.4.16"
}

group = "com.samvtran"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2019.3.3"
}
configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Initial Release!<br>
      <ul>
        <li>Most Command-key shortcuts remapped to similar shortcuts with some combination of Ctrl/Alt/Shift</li>
      </ul>""")
}
tasks.withType<PublishTask> {
    token(findProperty("intellijPublishToken"))
}

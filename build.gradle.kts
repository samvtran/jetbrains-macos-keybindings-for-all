
import org.jetbrains.intellij.tasks.PublishTask

plugins {
    id("org.jetbrains.intellij") version "0.4.16"
}

group = "com.samvtran"
version = "1.0.2"

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
      <ul>
        <li>Increasing supported IDE range from 2019.* to 2017 to 2020+</li>
      </ul>""")
    sinceBuild("173.*")
    untilBuild("202.*")
}
tasks.withType<PublishTask> {
    token(findProperty("intellijPublishToken"))
}

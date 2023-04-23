plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation(project(":common"))

    implementation(libs.jzlib)
    implementation(libs.jutf7)
    implementation(libs.commons.io)
    implementation(libs.okio)

    testImplementation(libs.bundles.shared.jvm.test.legacy)
    testImplementation(project(":testing"))
    testImplementation(libs.okio)
    testImplementation(libs.mime4j.core)
}
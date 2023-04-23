plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":common"))

    implementation(libs.commons.io)
    implementation(libs.okio)

    testImplementation(libs.bundles.shared.jvm.test.legacy)
    testImplementation(project(":testing"))
    testImplementation(libs.okio)
    testImplementation(libs.jzlib)
}

plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(libs.jetbrains.annotations)

    implementation(libs.mime4j.core)
    implementation(libs.mime4j.dom)
    implementation(libs.okio)
    implementation(libs.commons.io)
    implementation(libs.moshi)

    // We're only using this for its DefaultHostnameVerifier
    implementation(libs.apache.httpclient5)

    testImplementation(libs.bundles.shared.jvm.test.legacy)
    testImplementation(project(":testing"))
    testImplementation(libs.icu4j.charset)
}

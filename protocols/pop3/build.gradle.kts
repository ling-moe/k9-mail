plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17
dependencies {
    implementation(project(":common"))
    // https://mvnrepository.com/artifact/org.jetbrains/annotations
    compileOnly("org.jetbrains:annotations:24.0.1")
// https://mvnrepository.com/artifact/jakarta.mail/jakarta.mail-api
    implementation("jakarta.mail:jakarta.mail-api:2.1.1")


    testImplementation(libs.bundles.shared.jvm.test.legacy)
    testImplementation(project(":testing"))
    testImplementation(libs.okio)
    testImplementation(libs.jzlib)
    testImplementation(libs.commons.io)
}

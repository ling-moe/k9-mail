plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":common"))

    implementation(libs.okio)
    implementation(libs.junit)
}

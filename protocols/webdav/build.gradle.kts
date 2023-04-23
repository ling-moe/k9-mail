plugins {
    id("java")
}

group = "cn.lm"
version = "0.0.1-SNAPSHOT"

dependencies {
    implementation(project(":common"))

    implementation(libs.commons.io)
    compileOnly(libs.apache.httpclient)

    testImplementation(project(":testing"))
    testImplementation(libs.apache.httpclient)
}

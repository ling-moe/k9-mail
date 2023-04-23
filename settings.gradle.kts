rootProject.name = "k9-mail"

include(
    ":common",
    ":testing",
    ":protocols:imap",
    ":protocols:pop3",
    ":protocols:webdav",
    ":protocols:smtp",
)

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
    }

}
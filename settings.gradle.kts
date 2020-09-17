import de.fayard.refreshVersions.bootstrapRefreshVersions
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("de.fayard.refreshVersions:refreshVersions:0.9.5")
    }
}
bootstrapRefreshVersions()

rootProject.name = "latex-template"

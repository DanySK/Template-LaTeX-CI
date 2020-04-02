import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

rootProject.name = "latex-template"

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard:dependencies:+")
}

bootstrapRefreshVersionsAndDependencies()

import org.gradle.kotlin.dsl.support.expectedKotlinDslPluginsVersion

plugins {
  `kotlin-dsl`
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
  implementation("dev.adamko.dokkatoo:dokkatoo-plugin:2.0.0-SNAPSHOT")
}

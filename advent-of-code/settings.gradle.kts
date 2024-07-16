

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "advent-of-code"
val projectsList = listOf(
    "day_0",
    "day_1"
)

val projectsList2 = 

subProjectConfig(projectsList)
fun subProjectConfig(projectsList: List<String>) {
    for(projectName in projectsList) {
        val projectID =":$projectName"
        include(projectID)
        project(projectID).projectDir = file("exercises/$projectName")
    }
}
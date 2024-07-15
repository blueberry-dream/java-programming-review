// my build settings

plugins { java }

tasks.named<Jar>("jar") {
    archiveBaseName.set("my-app")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

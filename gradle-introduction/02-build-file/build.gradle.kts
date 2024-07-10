// manual gradle build file

tasks.register<Task>("helloWorld") {
    doLast {
        println("Hello, World!")
    }
}

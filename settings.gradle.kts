@file:Suppress("UnstableApiUsage")

rootProject.name = "reactor_planner"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("kotest", "5.3.1")
            version("atrium", "0.18.0")

            library("kotlin-reflect", "org.jetbrains.kotlin", "kotlin-reflect").withoutVersion()
            library("kotlin-jdk8", "org.jetbrains.kotlin", "kotlin-stdlib-jdk8").withoutVersion()
            bundle("kotlin", listOf("kotlin-reflect", "kotlin-jdk8"))

            library("spring-web", "org.springframework.boot", "spring-boot-starter-web").withoutVersion()
            bundle("spring-main", listOf("spring-web"))

            library("spring-web", "org.springframework.boot", "spring-boot-starter-web").withoutVersion()
            bundle("spring-main", listOf("spring-web"))

            library("spring-devtools", "org.springframework.boot", "spring-boot-devtools").withoutVersion()
            bundle("spring-dev", listOf("spring-devtools"))

            library("spring-test", "org.springframework.boot", "spring-boot-starter-test").withoutVersion()
            bundle("spring-test", listOf("spring-test"))

            library("kotest-core", "io.kotest", "kotest-runner-junit5").versionRef("kotest")
            bundle("kotest", listOf("kotest-core"))

            library("atrium-core", "ch.tutteli.atrium", "atrium-fluent-en_GB").versionRef("atrium")
            bundle("atrium", listOf("atrium-core"))
        }
    }
}
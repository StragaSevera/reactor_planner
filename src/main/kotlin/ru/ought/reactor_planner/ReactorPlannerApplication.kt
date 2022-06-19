package ru.ought.reactor_planner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactorPlannerApplication

fun main(args: Array<String>) {
    runApplication<ReactorPlannerApplication>(*args)
}

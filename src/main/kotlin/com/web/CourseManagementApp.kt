package com.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CourseManagementApp

fun main(args: Array<String>) {
    runApplication<CourseManagementApp>(*args)
}
package com.web.hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Controller for /hello path.
 * */

@RestController
open class HelloController {

    @RequestMapping("/hello")
    fun sayHi(): String {
        return "Hello World"
    }
}
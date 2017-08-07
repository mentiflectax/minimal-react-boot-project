package com.mycompany

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller

@SpringBootApplication
@Controller
open class MyApp {
    fun main(args: Array<String>) {
        SpringApplication.run(MyApp::class.java,*args)
    }
}
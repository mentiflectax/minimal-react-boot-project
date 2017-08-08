package com.mycompany

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver



@SpringBootApplication
@Controller
open class MyApp {
    @Bean
    open fun yourTemplateResolver(): ClassLoaderTemplateResolver {
        val yourTemplateResolver = ClassLoaderTemplateResolver()
        yourTemplateResolver.prefix = "templates/"
        return yourTemplateResolver
    }
    fun main(args: Array<String>) {
        SpringApplication.run(MyApp::class.java,*args)
    }
}
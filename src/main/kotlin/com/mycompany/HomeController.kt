package com.mycompany

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController {
    @RequestMapping(value = "/")
    fun index(): String {
        return "index"
    }
}
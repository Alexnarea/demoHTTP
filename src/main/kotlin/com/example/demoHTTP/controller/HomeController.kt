package com.example.demoHTTP.controller

import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {
    /*@GetMapping("/{id}")
    fun home(@PathVariable ("id") id: Int): String {
        return "Su ID es:  ${id}"
    }*/

    @GetMapping()
    fun home(@PathParam ("id") id: Int): String {
        return "Su ID es:  ${id}"
    }

}
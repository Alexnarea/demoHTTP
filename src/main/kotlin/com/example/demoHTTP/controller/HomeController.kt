package com.example.demoHTTP.controller

import com.example.demoHTTP.model.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController {
    /*@GetMapping("/{id}")
    fun home(@PathVariable ("id") id: Int): String {
        return "Su ID es:  ${id}"
    }*/

    /*@GetMapping()
    fun home(@PathParam ("id") id: Int): String {
        return "Su ID es:  ${id}"
    }*/

    @GetMapping()
    fun home(@RequestBody model: Model): String {
        return "Su ID es: ${model.id} su nombre es ${model.name} su correo electronico es ${model.mail} y tiene ${model.age} años"
    }
}
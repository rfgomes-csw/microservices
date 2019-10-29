package com.ricardo.organization

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController {
    @GetMapping("/")
    fun get() = "organization"
}
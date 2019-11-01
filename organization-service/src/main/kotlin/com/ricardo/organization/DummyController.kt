package com.ricardo.organization

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class DummyController() {
    @GetMapping("/")
    fun get() = "organization"

//    @GetMapping("/publish")
//    fun publish() =  mensagePublisher.publishOrgChange(UUID.randomUUID().toString())
}
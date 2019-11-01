package com.ricardo.licenseservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController(@Autowired val licenseService: LicenseService) {
    @GetMapping("/")
    fun getEurekaClient() = licenseService.getOrganization()
}

package com.ricardo.licenseservice

import com.ricardo.licenseservice.organization.OrganizationDiscoveryClient
import com.ricardo.licenseservice.organization.OrganizationFeignClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DummyController(@Autowired val organizationDiscoveryClient: OrganizationFeignClient) {
    @GetMapping("/")
    fun getEurekaClient() = organizationDiscoveryClient.getOrganization()
}

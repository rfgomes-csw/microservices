package com.ricardo.licenseservice.organization

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate


@Component
class OrganizationDiscoveryClient(@Autowired val restTemplate: RestTemplate) {
    fun getOrganization() : String {
        return restTemplate.exchange(
                "http://organizationservice/",
                HttpMethod.GET,
                null, String::class.java).body!!
    }
}
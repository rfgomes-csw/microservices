package com.ricardo.licenseservice.organization

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient("organizationservice")
interface OrganizationFeignClient {
    @RequestMapping(method = [RequestMethod.GET], consumes = ["application/json"])
    fun getOrganization(): String
}

package com.ricardo.licenseservice

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty
import com.ricardo.licenseservice.organization.OrganizationFeignClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class LicenseService(@Autowired val organizationClient: OrganizationFeignClient) {
    @HystrixCommand(fallbackMethod = "fallbackGetOrganization",
            threadPoolKey = "licenseByOrgThreadPool",
            threadPoolProperties = [
                HystrixProperty(name = "coreSize",value="30"),
                HystrixProperty(name="maxQueueSize", value="10")
            ]
    )
    fun getOrganization() : String {
        longRun()
        return organizationClient.getOrganization()
    }

    private fun longRun() {
        val rand = Random()
        val randomNum = rand.nextInt((3 - 1) + 1) + 1
        if (randomNum==3) Thread.sleep(11000)
    }

    private fun fallbackGetOrganization() : String {
        return "organizationservice down"
    }
}


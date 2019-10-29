package com.ricardo.organization

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.client.RestTemplate
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean


@SpringBootApplication
@EnableEurekaClient
class OrganizationApplication

fun main(args: Array<String>) {
    runApplication<OrganizationApplication>(*args)
}



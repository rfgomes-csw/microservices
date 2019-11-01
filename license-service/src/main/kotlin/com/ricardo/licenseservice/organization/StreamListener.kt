package com.ricardo.licenseservice.organization

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.cloud.stream.messaging.Source
import org.springframework.stereotype.Component

@Component
class StreamListener {
//    @StreamListener(Sink.INPUT)
    fun listener(message: String) {
        println(message)
    }
}
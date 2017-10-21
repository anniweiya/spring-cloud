package cn.anniweiya.eureka.client.controller

import org.bouncycastle.crypto.tls.ConnectionEnd
import org.bouncycastle.crypto.tls.ConnectionEnd.server
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientController {
    @Value("\${server.port}")
    private val port: String? = null

    @RequestMapping("/hello")
    fun hello(): String {
        return "hello world!!!" + port
    }
}

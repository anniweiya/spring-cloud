package cn.anniweiya.ribbon.service

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import javax.annotation.Resource

@Service
class RibbonService {

    @Resource
    val restTemplate: RestTemplate? = null

    fun hello(): ResponseEntity<String> {
        return restTemplate!!.getForEntity("http://SERVICE-HI/hello", String::class.java)
    }
}
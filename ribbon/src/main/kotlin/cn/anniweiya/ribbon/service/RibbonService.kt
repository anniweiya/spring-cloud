package cn.anniweiya.ribbon.service

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import javax.annotation.Resource

@Service
class RibbonService {

    @Resource
    val restTemplate: RestTemplate? = null

    @HystrixCommand(fallbackMethod = "helloError")
    fun hello(): ResponseEntity<String> {
        return restTemplate!!.getForEntity("http://SERVICE-HI/hello", String::class.java)
    }

    fun helloError(): ResponseEntity<String> {
        return ResponseEntity<String>("hello world fail !!!", HttpStatus.OK)

    }
}
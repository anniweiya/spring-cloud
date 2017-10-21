package cn.anniweiya.cloud.controller

import cn.anniweiya.cloud.service.FeignService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
class FeignController {

    @Resource
    val feignService: FeignService? = null

    @RequestMapping("hello")
    fun hello(): ResponseEntity<String> {
        return feignService!!.hello()
    }



}
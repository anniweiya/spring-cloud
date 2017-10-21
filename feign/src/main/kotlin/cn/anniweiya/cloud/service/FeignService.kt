package cn.anniweiya.cloud.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("service-hi")
interface FeignService {

    @RequestMapping("hello")
    fun hello(): ResponseEntity<String>

}
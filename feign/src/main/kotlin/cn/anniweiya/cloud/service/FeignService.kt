package cn.anniweiya.cloud.service

import cn.anniweiya.cloud.service.impl.FeignServiceImpl
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("service-hi", fallback = FeignServiceImpl::class)
interface FeignService {

    @RequestMapping("hello")
    fun hello(): ResponseEntity<String>

}
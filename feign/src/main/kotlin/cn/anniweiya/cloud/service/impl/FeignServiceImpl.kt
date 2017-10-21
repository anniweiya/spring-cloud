package cn.anniweiya.cloud.service.impl

import cn.anniweiya.cloud.service.FeignService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component

@Component
class FeignServiceImpl : FeignService {

    override fun hello(): ResponseEntity<String> {
        return ResponseEntity.ok("hello world fail !!!")
    }

}
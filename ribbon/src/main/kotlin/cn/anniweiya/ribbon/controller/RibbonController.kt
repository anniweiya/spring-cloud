package cn.anniweiya.ribbon.controller

import cn.anniweiya.ribbon.service.RibbonService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import javax.annotation.Resource

@Controller
class RibbonController {

    @Resource
    val ribbonService: RibbonService? = null

    @RequestMapping("hello")
    fun hello(): ResponseEntity<String>? {
        return ribbonService?.hello()
    }

}
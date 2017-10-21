package cn.anniweiya.ribbon

import cn.anniweiya.ribbon.config.RibbonClientConfiguation
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("cn.anniweiya.ribbon")
@EnableAutoConfiguration
@EnableDiscoveryClient
@RibbonClient(name = "service-hi", configuration = arrayOf(RibbonClientConfiguation::class))
class RibbonApplication
fun main(args: Array<String>) {
    SpringApplication.run(RibbonApplication::class.java, *args)
}

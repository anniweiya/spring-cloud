package cn.anniweiya.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
class FeignApplication

fun main(args: Array<String>) {
    SpringApplication.run(FeignApplication::class.java, *args)
}

package cn.anniweiya.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
class ZuulApplication

fun main(args: Array<String>) {
    SpringApplication.run(ZuulApplication::class.java, *args)
}

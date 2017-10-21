package cn.anniweiya.eureka.client

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@ComponentScan("cn.anniweiya.eureka.client")
class EurekaClientApplication

fun main(args: Array<String>) {
    SpringApplication.run(EurekaClientApplication::class.java, *args)
}


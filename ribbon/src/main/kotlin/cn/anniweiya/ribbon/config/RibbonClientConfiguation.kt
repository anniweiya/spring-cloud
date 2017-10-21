package cn.anniweiya.ribbon.config

import com.netflix.client.config.IClientConfig
import com.netflix.loadbalancer.AvailabilityFilteringRule
import com.netflix.loadbalancer.IPing
import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.PingUrl
import org.springframework.context.annotation.Bean

import javax.annotation.Resource

class RibbonClientConfiguation {

    @Resource
    internal var ribbonClientConfig: IClientConfig? = null

    @Bean
    fun ribbonPing(config: IClientConfig): IPing {
        return PingUrl()
    }

    @Bean
    fun ribbonRule(config: IClientConfig): IRule {
        return AvailabilityFilteringRule()
    }


}

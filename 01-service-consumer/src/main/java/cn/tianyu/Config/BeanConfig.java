package cn.tianyu.Config;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//进行标注 相当于application.xml
public class BeanConfig {


    @LoadBalanced//就能负载均衡的能力了
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    //随机的负载均衡
//    @Bean
//    public IRule iRule(){
//        return new RandomRule();
//    }

}

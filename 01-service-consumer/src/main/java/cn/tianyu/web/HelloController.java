package cn.tianyu.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/service/consumer/hello")
    public String hello(){
        return restTemplate.getForEntity("http://service-provider/service/provider/test",String.class).getBody()+"服务消费者";

    }

    @RequestMapping("/service/consumer/test")
    public String test(){
        return restTemplate.getForEntity("http://service-provider/service/provider/test",String.class).getBody()+"服务消费者";

    }
}


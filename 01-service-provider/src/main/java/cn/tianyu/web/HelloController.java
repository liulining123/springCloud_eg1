package cn.tianyu.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/service/provider/hello")
    public String hello(){
        return "hello provider";
    }

    @RequestMapping("/service/provider/test")
    public String test(){
        System.err.println("提供者01");
        return "使⽤了Eureka注册中⼼的服务提供者01！";
    }
}

package cn.tianyu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EsApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(EsApplication8001.class,args);
    }
}

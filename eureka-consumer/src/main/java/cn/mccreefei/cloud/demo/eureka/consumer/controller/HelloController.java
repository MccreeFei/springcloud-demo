package cn.mccreefei.cloud.demo.eureka.consumer.controller;

import cn.mccreefei.cloud.demo.eureka.consumer.service.RemoteHelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author MccreeFei
 * @create 2020-02-06 下午3:19
 */
@RestController
public class HelloController {
    @Resource
    RemoteHelloService remoteHelloService;
    @Value("${server.port}")
    private String serverPort;
    @Value("${consumer.env}")
    private String env;
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return remoteHelloService.sayHello(name);
    }

    @GetMapping("/port")
    public String getServerPort() {
        return serverPort;
    }

    @GetMapping("/env")
    public String getEnv() {
        return env;
    }
}

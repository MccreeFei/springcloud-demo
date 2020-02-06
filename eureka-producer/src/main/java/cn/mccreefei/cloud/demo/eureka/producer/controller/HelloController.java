package cn.mccreefei.cloud.demo.eureka.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MccreeFei
 * @create 2020-02-06 下午3:07
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return "Hello, " + name + "!";
    }
}

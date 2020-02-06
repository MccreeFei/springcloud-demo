package cn.mccreefei.cloud.demo.producer.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MccreeFei
 * @create 2020-02-06 下午8:09
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam("name") String name) {
        return "Producer Two say Hello, " + name + "!";
    }
}

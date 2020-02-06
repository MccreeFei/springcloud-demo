package cn.mccreefei.cloud.demo.eureka.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author MccreeFei
 * @create 2020-02-06 下午3:26
 */
@FeignClient(name = "eureka-producer")
public interface RemoteHelloService {
    @GetMapping("/hello")
    String sayHello(@RequestParam("name") String name);
}

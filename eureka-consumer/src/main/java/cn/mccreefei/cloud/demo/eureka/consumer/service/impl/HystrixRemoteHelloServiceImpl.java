package cn.mccreefei.cloud.demo.eureka.consumer.service.impl;

import cn.mccreefei.cloud.demo.eureka.consumer.service.RemoteHelloService;
import org.springframework.stereotype.Service;

/**
 * @author MccreeFei
 * @create 2020-02-18 下午4:22
 */
@Service
public class HystrixRemoteHelloServiceImpl implements RemoteHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello service fall back!";
    }
}

package cn.mccreefei.cloud.demo.producer.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MccreeFei
 * @create 2020-02-06 下午8:08
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerTwoApplication.class, args);
    }
}

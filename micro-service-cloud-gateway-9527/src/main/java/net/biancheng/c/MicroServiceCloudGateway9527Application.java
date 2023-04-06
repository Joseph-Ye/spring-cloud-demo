package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jhye4@ilfytek.com
 * @date 2023/4/6 17:07
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudGateway9527Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudGateway9527Application.class, args);
    }
}

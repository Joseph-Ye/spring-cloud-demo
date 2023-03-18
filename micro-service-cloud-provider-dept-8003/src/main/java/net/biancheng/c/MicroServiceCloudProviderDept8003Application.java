package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jhye4@ilfytek.com
 * @date 2023/3/17 11:14
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudProviderDept8003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8003Application.class, args);
    }
}

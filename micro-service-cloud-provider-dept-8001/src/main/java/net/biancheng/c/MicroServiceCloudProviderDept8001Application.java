package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author jhye4@ilfytek.com
 * @date 2023/3/16 15:08
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroServiceCloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8001Application.class, args);
    }
}

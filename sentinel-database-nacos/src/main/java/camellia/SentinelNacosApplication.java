package camellia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author anthea
 * @date 2023/10/15 17:21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SentinelNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosApplication.class, args);
    }
}

package camellia.controller;

import camellia.service.OrderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/11 21:46
 */
@RestController
@RequestMapping("/order")
public class OrderController {
//    @Value("${service-url.nacos-user-service}")
//    private String serverUrl;
//
//    @Value("${server.port}")
//    private String port;
//
//    @Resource
//    private RestTemplate restTemplate;
//
//    @GetMapping("/nacos/test")
//    @SentinelResource(value = "test")
//    public String test() {
//        return restTemplate.getForObject(serverUrl+"/payment/test", String.class);
//    }

    @Resource
    private OrderService orderService;

    @GetMapping("/openfeign")
    public String testFeign() {
        return orderService.test();
    }
}

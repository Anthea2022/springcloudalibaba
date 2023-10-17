package camellia.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author anthea
 * @date 2023/10/15 16:50
 */
@FeignClient(value = "nacos-payment", fallback = OrderFallbackService.class)
public interface OrderService {
    @GetMapping("/payment/test")
    public String test();
}

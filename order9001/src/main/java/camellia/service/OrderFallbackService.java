package camellia.service;

import org.springframework.stereotype.Component;

/**
 * @author anthea
 * @date 2023/10/15 16:53
 */
@Component
public class OrderFallbackService implements OrderService {
    @Override
    public String test() {
        return "fallback";
    }
}

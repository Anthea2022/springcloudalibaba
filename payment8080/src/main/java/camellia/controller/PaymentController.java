package camellia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthea
 * @date 2023/10/11 21:25
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test() {
        return "OK" + port;
    }
}

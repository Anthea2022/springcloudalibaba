package camellia.controller;

import camellia.exception.ExceptionHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthea
 * @date 2023/10/11 22:16
 */
@Slf4j
@RestController
@RefreshScope
public class SentinelController {
    @GetMapping("/testA")
    @SentinelResource(value = "testA", blockHandlerClass = ExceptionHandler.class, blockHandler = "globalHandle")
    public String testA() {
        return "OK";
    }

    @GetMapping("/testB")
    public String testB() {
        return "error";
    }
}

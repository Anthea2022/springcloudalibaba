package camellia.service;

import anthea.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author anthea
 * @date 2023/10/16 16:32
 */
@FeignClient(value = "seata-store")
public interface StoreService {
    @PostMapping("/store/reduce")
    public BaseResponse<Object> reduceStore(@RequestParam("pid") Integer pid, @RequestParam("count") Integer count);
}

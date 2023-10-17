package camellia.controller;

import anthea.BaseResponse;
import camellia.service.StoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/16 21:16
 */
@RestController
@RequestMapping("/store")
public class StoreController {
    @Resource
    private StoreService storeService;

    @PostMapping("/reduce")
    public BaseResponse<Object> reduce(@RequestParam("pid") Integer pid, @RequestParam("count") Integer count) {
        return  storeService.reduce(pid, count);
    }
}

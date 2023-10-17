package camellia.controller;

import anthea.BaseResponse;
import camellia.domian.Order;
import camellia.service.OrderService;
import camellia.service.StoreService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/17 20:58
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @Resource
    private StoreService storeService;

    @GlobalTransactional
    @PostMapping("/create")
    public BaseResponse<Object> create(@RequestBody Order order) {
        orderService.save(order);
        return storeService.reduceStore(order.getPid(), order.getCount());
    }
}

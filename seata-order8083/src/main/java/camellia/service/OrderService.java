package camellia.service;

import anthea.BaseResponse;
import camellia.dao.OrderDao;
import camellia.domian.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/16 16:20
 */
@Service
@Slf4j
public class OrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    private StoreService storeService;

    public BaseResponse<Object> save(Order order) {
        orderDao.create(order);
        storeService.reduceStore(order.getPid(), order.getCount());
        orderDao.update(order.getId());
        return BaseResponse.success("订单完成");
    }

    public BaseResponse<Object> getById(Integer id) {
        return BaseResponse.success(orderDao.getById(id));
    }
}

package camellia.service;

import anthea.BaseResponse;
import camellia.dao.StoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author anthea
 * @date 2023/10/16 21:20
 */
@Service
public class StoreService {
    @Resource
    private StoreMapper storeMapper;

    public BaseResponse<Object> reduce(Integer pid, Integer count) {
        storeMapper.reduce(pid, count);
        return BaseResponse.success("减库存成功");
    }
}

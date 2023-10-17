package camellia.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author anthea
 * @date 2023/10/16 21:21
 */
@Mapper
public interface StoreMapper {
    @Update("update store set residue-=#{count}, used += #{count} where pid = #{pid}")
    void reduce(Integer pid, Integer count);
}

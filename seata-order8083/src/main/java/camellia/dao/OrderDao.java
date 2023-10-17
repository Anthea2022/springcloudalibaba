package camellia.dao;

import camellia.domian.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author anthea
 * @date 2023/10/16 16:18
 */
@Mapper
public interface OrderDao {
    @Insert("insert into order (uid, pid, count, money, status) values (#{uid}, #{pid}, #{count}, #{money}, 0)")
    void create(Order order);

    @Select("select * from order where id = #{id}")
    Order getById(Integer id);

    @Update("update order set status = 1 where id = #{id}")
    void update(Integer id);
}

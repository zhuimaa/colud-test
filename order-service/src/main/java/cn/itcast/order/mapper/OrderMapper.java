package cn.itcast.order.mapper;

import cn.itcast.order.pojo.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select * from tb_order where id = #{id}")
    Order findById(Long id);
    //版本测试
    //冲突测试
    //chongtu 2
}

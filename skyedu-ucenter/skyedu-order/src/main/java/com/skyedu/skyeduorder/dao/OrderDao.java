package com.skyedu.skyeduorder.dao;

import com.skyedu.skyeduorder.entity.Order;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDao {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);
}

package com.skyedu.skyeduorder.service;

import com.skyedu.skyeduorder.entity.Order;

/**
 *
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);
}

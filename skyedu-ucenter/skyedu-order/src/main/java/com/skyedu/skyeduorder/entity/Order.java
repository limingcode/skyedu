package com.skyedu.skyeduorder.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 订单
 *
 */
@Data
public class Order implements Serializable {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;



}

package com.skyedu.skyeduaccount.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;


/**
 * @author LiMing
 * 账户pojo
 */
@Data
public class Account  implements Serializable {

    private Long id;

    /**用户id*/
    private Long userId;

    /**总额度*/
    private BigDecimal total;

    /**已用额度*/
    private BigDecimal used;

    /**剩余额度*/
    private BigDecimal residue;
}

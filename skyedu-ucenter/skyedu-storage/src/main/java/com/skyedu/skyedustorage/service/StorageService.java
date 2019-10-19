package com.skyedu.skyedustorage.service;


import com.skyedu.skyeducommon.response.ResponseResult;

public interface StorageService {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    
    void decrease(Long productId, Integer count) throws ResponseResult;
}

package com.skyedu.skyedustorage.service;

import com.skyedu.skyeducommon.ExceptionCatch;
import com.skyedu.skyeducommon.exception.CustomException;
import com.skyedu.skyeducommon.response.ResponseResult;
import com.skyedu.skyeducommon.response.ResultCode;
import com.skyedu.skyedustorage.dao.StorageDao;
import com.skyedu.skyedustorage.entity.Storage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService {
    /**
     * logger日志工厂
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageDao storageDao;

    /**
     * 扣减库存
     * 1:进行校验  如 库存不足则提示用户稍后再试
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @Override
    public void decrease(Long productId, Integer count) throws ResponseResult {
        LOGGER.info("------->扣减库存开始");

      storageDao.decrease(productId, count);
        Storage storage=new Storage();
        int residue=storage.getResidue();
        LOGGER.info("库存数量!"+residue);
        if (residue<=0){
          throw ResponseResult.FAIL();

        }


        LOGGER.info("------->扣减库存结束");
    }
}

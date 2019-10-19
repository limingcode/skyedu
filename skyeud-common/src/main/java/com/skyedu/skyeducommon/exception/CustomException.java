package com.skyedu.skyeducommon.exception;

import com.skyedu.skyeducommon.response.ResultCode;

/**
 * @author MingLi
 * @version X.0
 * @date 2019/10/18 23:29
 * 自定义异常处理类
 */

public class CustomException extends RuntimeException {
    // 错误代码
        ResultCode resultCode;
        public CustomException(ResultCode resultCode){
            this.resultCode=resultCode;
        }
        //获取或异常的方法
    public ResultCode getResultCode(){
            return resultCode;
    }


}

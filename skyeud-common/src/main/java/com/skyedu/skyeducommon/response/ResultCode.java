package com.skyedu.skyeducommon.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MingLi
 * @version X.0
 * @date 2019/10/18 22:52
 * 通用错误代码的标识
 * 如： 25000-- 文件系统
 *       23000-- 用户中心错误代码
 *
 */

public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    boolean success();
    //操作代码
    int code();
    //提示信息
    String message();
}

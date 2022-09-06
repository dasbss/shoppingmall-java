package com.lqm.Utils;

import com.lqm.Eunm.ResultCode;
import com.lqm.api.Result;

public class ResultUtils {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    //只返回状态码;
    public static Result success(){
        return new Result().setResult(ResultCode.SUCCESS);
    }

    //成功返回数据;
    public static Result success(Object data) {
        return new Result().setResult(ResultCode.SUCCESS, data);
    }

    // 失败
    public static Result failure(ResultCode resultCode) {
        return new Result().setResult(resultCode);
    }

    // 失败
    public static Result failure(ResultCode resultCode, Object data) {
        return new Result().setResult(resultCode, data);
    }
}
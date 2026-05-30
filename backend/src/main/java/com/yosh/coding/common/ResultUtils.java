package com.yosh.coding.common;

import com.yosh.coding.exception.ErrorCode;

public class ResultUtils {
    public static BaseResponse success(Object data) {
        return new BaseResponse(0, data, "ok");
    }
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse(errorCode.getCode(), null, errorCode.getMessage());
    }
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}

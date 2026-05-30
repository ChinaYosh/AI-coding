package com.yosh.coding.common;

import com.yosh.coding.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Stack;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;
}

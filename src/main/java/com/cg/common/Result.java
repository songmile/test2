package com.cg.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 统一返回结果类
 * @param <T> 响应内容实际类型
 */
@Data
@AllArgsConstructor
public class Result<T> {
    //响应码（1表示成功，0表示失败）
    private int code;
    //响应消息
    private String message;
    //响应内容
    private T data;

}

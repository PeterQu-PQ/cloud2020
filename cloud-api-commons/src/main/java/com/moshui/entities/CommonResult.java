package com.moshui.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    /**
     *
     * @param code
     * @param message
     * 构造无data的构造函数
     */
    public CommonResult(int code, String message){
        this(code,message,null);
    }


}

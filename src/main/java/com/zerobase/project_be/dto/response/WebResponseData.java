package com.zerobase.project_be.dto.response;

import com.zerobase.project_be.error.ErrorCode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WebResponseData<T> {        
    private ErrorCode errorCode;
    private T data;

    public static <T> WebResponseData<T> ok(T data) {
        return new WebResponseData<T>(ErrorCode.SUCCESS, data);
    }

    public static <T> WebResponseData<T> error(ErrorCode errorCode, T data) {
        return new WebResponseData<T>(errorCode, data);
    }
}

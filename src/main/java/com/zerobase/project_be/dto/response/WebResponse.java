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
public class WebResponse {    
    private ErrorCode errorCode;

    public static WebResponse ok() {
        return new WebResponse(ErrorCode.SUCCESS);
    }

    public static WebResponse error(ErrorCode errorCode) {
        return new WebResponse(errorCode);
    }
}
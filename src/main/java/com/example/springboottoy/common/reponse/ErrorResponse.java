package com.example.springboottoy.common.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * fileName     : ErrorResponse.java
 * author       : hyunseo
 * date         : 2025. 1. 31.
 * description  : 공통 오류 객체
 */
@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;
    private String errorDetail;

    /**
     * 공용 오류 객체
     * @param errorCode
     * @param errorMessage
     * @param errorDetail
     * @return
     */
    public static ErrorResponse of(String errorCode, String errorMessage, String errorDetail) {
        return new ErrorResponse(errorCode, errorMessage, errorDetail);
    }
}

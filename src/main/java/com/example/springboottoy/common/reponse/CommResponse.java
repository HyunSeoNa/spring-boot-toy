package com.example.springboottoy.common.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * fileName     : CommResponse.java
 * author       : hyunseo
 * date         : 2025. 1. 31.
 * description  : 공통 응답 객체
 */
@Data
@Builder
@AllArgsConstructor
public class CommResponse<T> {
    private String resultStatus;
    private String message;
    private T data;

    /**
     * 공용 응답 객체 - 성공
     * @param message
     * @param data
     * @return CommonResponse
     * @param <T>
     */
    public static <T> CommResponse<T> success(String message, T data) {
        return new CommResponse<>("S", message, data);
    }

    /**
     * 공용 응답 객체 - 실패
     * @param message
     * @param data
     * @return CommonResponse
     * @param <T>
     */
    public static <T> CommResponse<T> error(String message, T data) {
        return new CommResponse<>("E", message, data);
    }
}

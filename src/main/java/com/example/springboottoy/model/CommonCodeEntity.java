package com.example.springboottoy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * fileName     : CommonCodeDTO.java
 * author       : hyunseo
 * date         : 2025. 2. 2.
 * description  : 공통코드 DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonCodeEntity {
    private String codeHd;
    private String codeHdNm;
    private Integer ord;
    private String rem;
    private String regId;
    private String regDt;
    private String modId;
    private String modDt;
    private String sts;
}

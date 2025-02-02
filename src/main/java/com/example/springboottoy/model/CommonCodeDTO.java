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
public class CommonCodeDTO {
    private String codeHd;
    private String codeHdNm;
    private Integer ord;
    private String rem;

    public static CommonCodeDTO toDTO(CommonCodeEntity entity) {
        return CommonCodeDTO.builder()
                .codeHd(entity.getCodeHd())
                .codeHdNm(entity.getCodeHdNm())
                .ord(entity.getOrd())
                .rem(entity.getRem())
            .build();
    }
}

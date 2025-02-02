package com.example.springboottoy.mappers;

import com.example.springboottoy.model.CommonCodeDTO;
import com.example.springboottoy.model.CommonCodeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * fileName     : AdminMapper.java
 * author       : hyunseo
 * date         : 2025. 2. 2.
 * description  : 관리자 Mapper
 */
@Mapper
public interface AdminMapper {
    List<CommonCodeEntity> findListCommonCode(CommonCodeDTO param);
}

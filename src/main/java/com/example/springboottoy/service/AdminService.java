package com.example.springboottoy.service;

import com.example.springboottoy.mappers.AdminMapper;
import com.example.springboottoy.model.CommonCodeDTO;
import com.example.springboottoy.model.CommonCodeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * fileName     : AdminService.java
 * author       : hyunseo
 * date         : 2025. 2. 2.
 * description  : 관리자 Service
 */
@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminMapper adminMapper;

    public List<CommonCodeDTO> getListCommonCode(CommonCodeDTO param) {
        return adminMapper.findListCommonCode(param).stream().map(CommonCodeDTO::toDTO).collect(Collectors.toList());
    }
}

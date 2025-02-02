package com.example.springboottoy.controller;

import com.example.springboottoy.common.reponse.CommResponse;
import com.example.springboottoy.model.CommonCodeDTO;
import com.example.springboottoy.model.CommonCodeEntity;
import com.example.springboottoy.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * fileName     : AdminController.java
 * author       : hyunseo
 * date         : 2025. 2. 2.
 * description  : 관리자 Controller
 */
@RestController("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/common-codes")
    public ResponseEntity<?> getListCommonCode(CommonCodeDTO param) {
        List<CommonCodeDTO> codeList = adminService.getListCommonCode(param);
        return ResponseEntity.ok(CommResponse.success("공통코드 조회 성공", codeList));
    }
}

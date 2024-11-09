package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    // GET 방식으로 사번을 반환하는 API
    @GetMapping("/user")
    public String getUserId() {
        // employeeId를 경로에서 추출해 사번을 리턴
        return "82022007";
    }
}

package com.gmall.user.controller;

import com.gmall.bean.UserInfo;
import com.gmall.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "hello index";
    }

    @RequestMapping("/userInfoList")
    public ResponseEntity<List<UserInfo>> userInfoList(){
        List<UserInfo> userInfoList = userService.userInfoList();
        return ResponseEntity.ok(userInfoList);
    }
}

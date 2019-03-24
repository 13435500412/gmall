package com.gmall.user.service.impl;

import com.gmall.bean.UserInfo;
import com.gmall.bean.service.UserService;
import com.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}

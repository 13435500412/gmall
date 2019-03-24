package com.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserInfo;
import com.gmall.service.UserService;
import com.gmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service  //dubbo包下的Service
public class UserInfoService implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}

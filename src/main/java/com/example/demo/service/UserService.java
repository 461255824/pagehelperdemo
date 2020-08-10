/**
 * Licensed to CMIOV.Inc. under the terms of the CMIOV
 * Software License version 1.0.
 * <p>
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * ----------------------------------------------------------------------------
 * Date           Author               Version        Comments
 * 06/08/2020     Yang-QiYan           1.0            Initial Version
 */
package com.example.demo.service;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectAll();
    }
}

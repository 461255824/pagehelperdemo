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
package com.example.demo.controller;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public List<User> sayHello(@RequestParam("num") int pageNum, @RequestParam("size") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userService.getUsers();
        return users;
    }

    @GetMapping("/helloAll")
    public List<User> sayHelloAll() {
        List<User> users = userService.getUsers();
        return users;
    }
}

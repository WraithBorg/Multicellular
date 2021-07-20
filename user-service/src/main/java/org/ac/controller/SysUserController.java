package org.ac.controller;

import org.ac.domain.SysUser;
import org.ac.service.ISysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class SysUserController {
    @Resource
    ISysUserService userService;

    @GetMapping("/{userId}")
    public SysUser getUser(@PathVariable String userId){
        return userService.getUser(userId);
    }
}

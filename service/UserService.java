package com.ajz.service;

import com.ajz.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.security.NoSuchAlgorithmException;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/5/21 14:35
 */

/**
 * 用户服务
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param userCode 用户号
     * @return 新账户
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String userCode);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLongin(String userAccount, String userPassword, HttpServletRequest request) throws NoSuchAlgorithmException;

    User getSafetyUser(User originUser);

    /**
     * 请求用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}

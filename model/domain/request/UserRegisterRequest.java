package com.ajz.model.domain.request;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/5/22 09:36
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String userCode;
}

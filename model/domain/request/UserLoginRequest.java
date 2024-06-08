package com.ajz.model.domain.request;

import lombok.Data;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/5/22 09:48
 */
@Data
public class UserLoginRequest {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;
    private String userPassword;
}

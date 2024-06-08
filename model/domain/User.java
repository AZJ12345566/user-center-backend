package com.ajz.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/5/21 07:47
 */
@TableName(value = "user")
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private String userAccount;

    private String avatarUrl;

    private Integer gender;

    private String userPassword;

    private String phone;

    private String email;

    private Integer userStatus;

    private Integer userRole;

    private Date createTime;

    private Date updateTime;

    @TableLogic
    private Integer isDelete;

    /**
     * 用户账户编号
     */
    private String userCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

package com.ajz.service;
import java.util.Date;

import com.ajz.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/5/21 14:50
 */

/**
 * 用户服务测试
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("catAjz");
        user.setUserAccount("123");
        user.setAvatarUrl("https://image.baidu.com/search/detail?ct=503316480&z=undefined&tn=baiduimagedetail&ipn=d&word=西湖&step_word=&lid=7683347354391017511&ie=utf-8&in=&cl=2&lm=-1&st=undefined&hd=undefined&latest=undefined&copyright=undefined&cs=145514677,1715031195&os=2789395135,795457618&simid=3397501732,214101181&pn=22&rn=1&di=7355526631391232001&ln=1986&fr=&fmq=1716274980380_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&is=0,0&istype=0&ist=&jit=&bdtype=0&spn=0&pi=0&gsm=1e&objurl=https%3A%2F%2Fatt2.citysbs.com%2Fhangzhou%2F2017%2F12%2F13%2F21%2Fmiddle_1000x1510-214041_v2_11561513172441364_a3f627371ff1bef264bd2637aa5c387c.jpg&rpstart=0&rpnum=0&adpicid=0&nojc=undefined&dyTabStr=MCwxLDMsMiw0LDYsNSw4LDcsOQ%3D%3D");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        assertTrue(result);
    }

    @Test
    void userRegister() {
        String userAccount = "ajz";
        String userPassword = "";
        String checkPassword = "123456";
        String userCode = "1";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        userAccount = "ai";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        userAccount = "aiji";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        userAccount = "ai ji";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        userAccount = "aijingz";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
        userAccount = "aiji";
        result = userService.userRegister(userAccount, userPassword, checkPassword, userCode);
        Assertions.assertEquals(-1, result);
    }
}
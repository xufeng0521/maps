package com.example.maps.shiro;

import com.example.maps.bean.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.shiro.authc.AuthenticationToken;


/**
 * @author lhr
 * 2020/1/2 16:19
 * 自定义shiro的token
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyAuthenticationToken implements AuthenticationToken {
    private String account;
    private String password;

    public MyAuthenticationToken(User login){
        this.account = login.getUsername();
        this.password = login.getPassword();
//        this.rememberMe = login.getRememberMe();
//        this.type = login.getType();
//        this.autoLogin = login.getAutoLogin();
    }

    @Override
    public Object getPrincipal() {
        return getAccount();
    }

    @Override
    public Object getCredentials() {
        return getPassword();
    }
}

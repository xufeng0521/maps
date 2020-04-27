package com.example.maps.shiro;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

public class SignUpHelper {

    // 生成随机数
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    // 加密算法
    private static final String ALGORITHMNAME = "md5";
    // 散列次数
    private static final Integer HASHITERATIONS = 2;

    /**
     * 注册的时候，随机产生一个salt，将密码进行加密处理。
     * toHex将变量改为其他进制
     * @param user
     */
    // public static User encryptPassword(User user) {
    //
    //     // User对象包含最基本的字段Username和Password
    //     user.setSalt(randomNumberGenerator.nextBytes().toHex());
    //
    //     // 将用户的注册密码经过散列算法替换成一个不可逆的新密码保存进数据，散列过程使用了盐
    //     String newPassword = new SimpleHash(ALGORITHMNAME, user.getPassword(),
    //             ByteSource.Util.bytes(user.getSalt()), HASHITERATIONS).toHex();
    //     user.setPassword(newPassword);
    //
    //     return user;
    // }
}

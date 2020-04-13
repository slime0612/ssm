package com.itheima.utils;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    @Test
    public void main() {
        String password="123";
        String pwd = encodePassword(password);
        //$2a$10$f1gnzy9zD1H.Ipynpd2ZkuIHJ/huaseQYudg1BcKoj3aFl3Fb9WQu
        System.out.print(pwd);
    }
}

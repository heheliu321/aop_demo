package com.itcast.product.service;

import com.itcast.product.security.CurrentUserHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthService {


    public   void checkAccess(){
        if (!"admin".equalsIgnoreCase(CurrentUserHolder.get())){
           throw  new RuntimeException("role no allow");
        }
    }


}

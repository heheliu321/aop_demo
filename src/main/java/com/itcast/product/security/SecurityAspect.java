package com.itcast.product.security;

import com.itcast.product.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {


    @Autowired
    AuthService authService;

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){

    }

    @Before("adminOnly()")
    public  void  check(){
        authService.checkAccess();
    }


}

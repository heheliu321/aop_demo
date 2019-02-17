package com.itcast.product.service;

import com.itcast.product.Product;
import com.itcast.product.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {


    @Autowired
    public AuthService authService;


    @AdminOnly
    public void add(Product product){

//        authService.checkAccess(role);
        System.out.println("add com.itcast.product");
    }


    @AdminOnly
    public  void delete(Product product){

//        authService.checkAccess(role);
        System.out.println("delete com.itcast.product");
    }


}

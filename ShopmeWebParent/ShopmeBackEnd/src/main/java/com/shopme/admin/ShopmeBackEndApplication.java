package com.shopme.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopmeBackEndApplication {
    public static void main(String[] args){
    	System.out.println(System.getProperty("java.version"));
        SpringApplication.run(ShopmeBackEndApplication.class, args);
    }
}


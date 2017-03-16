package com.baobaotao.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by ligangxiao on 2017/3/16.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{
    public void before(Method method ,Object[]args,Object obj){
        String clientName = (String) args[0];
        System.out.println("How as you ! Mr."+clientName);
    }

}

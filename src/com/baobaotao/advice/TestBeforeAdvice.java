package com.baobaotao.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by ligangxiao on 2017/3/16.
 */
public class TestBeforeAdvice {
    public static void main(String[] args){
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        //1Spring工厂的代理类
        ProxyFactory pf = new ProxyFactory();
        //2设置代理目标
        pf.setTarget(target);
        //3为代理目标设置增强
        pf.addAdvice(advice);
        //4生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");

    }
}

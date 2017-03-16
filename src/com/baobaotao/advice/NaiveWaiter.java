package com.baobaotao.advice;

/**
 * Created by ligangxiao on 2017/3/16.
 */
public class NaiveWaiter implements Waiter{

    public void greetTo(String name){
        System.out.println("greet to "+name+"...");
    };
    public void serveTo(String name){
        System.out.println("serving "+name+"...");
    };


}

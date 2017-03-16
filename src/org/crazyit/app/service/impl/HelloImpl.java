package org.crazyit.app.service.impl;

import org.crazyit.app.service.Hello;
import org.springframework.stereotype.Component;

/**
 * Created by ligangxiao on 2017/3/14.
 */
@Component("hello")
public class HelloImpl implements Hello{

    @Override
    //定义一个addUser()方法
    public int addUser(String name, String pass) {
        System.out.println("执行Hello组件中addUser添加用户的方："+name);
       if(name.length()>3){
            throw new IllegalArgumentException("name 参数的长度必须大于3.小于10");
       }
        return 20;
    }



    @Override
    public void foo() {
        System.out.println("执行Hello组件中的foo()方法");
    }
}

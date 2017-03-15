package org.crazyit.app.service.impl;

import org.crazyit.app.service.Hello;
import org.springframework.stereotype.Component;

/**
 * Created by ligangxiao on 2017/3/14.
 */
@Component("hello")
public class HelloImpl implements Hello{

    @Override
    public void foo() {
        System.out.println("执行Hello组件中的foo()方法");
    }

    @Override
    public void addUser(String name, String pass) {
        System.out.println("执行Hello组件中addUser添加用户的方："+name);
    }
}

package org.crazyit.app.lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.crazyit.app.service.*;
/**
 * Created by ligangxiao on 2017/3/14.
 */
public class BeanTest
{
    public static void main(String[] args)
    {
        // 创建Spring容器
        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("bean.xml");
        Hello hello = ctx.getBean("hello" , Hello.class);
        hello.foo();
        hello.addUser("孙悟空s" , "7788");
        World world = ctx.getBean("world" , World.class);
        world.bar();

    }
}

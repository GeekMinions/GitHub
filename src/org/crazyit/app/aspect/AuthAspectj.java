package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 定义一个切面
 *
 */
@Aspect
public class AuthAspectj {
    //匹配org.crazyit.app.service.impl包下所有的类
    //所有的方法的执行作为切入点
    //@Before 执行该路径下的方法作为切点，切入这个切面
    @Before("execution(* org.crazyit.app.service.impl.*.*(..))")
    public void authority(){
        System.out.println("模拟执行权限检查");
    }
}

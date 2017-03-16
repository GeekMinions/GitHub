package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @AfterReturning:切点之后生效，当切点结束后，将会切入这个切面
 */
@Aspect
public class LogAspectj {
    //匹配所有org.crazyit.app.service.impl包下所有的类
    //所有方法的执行作为切入点
    @AfterReturning(returning="rvt",pointcut = "execution(* org.crazyit.app.service.impl.*.*(..))")
    //声明rvt时制定的类型会限制目标方法必须返回指定类型的值或没有返回值
    //此处件rvt声明为Object，意味着对目标方法的返回值不加限制
    public void log(Object rvt){
        System.out.println("获取目标方法返回值："+rvt);
        System.out.println("模拟记录日志功能。。。");
    }
}

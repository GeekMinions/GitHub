package org.crazyit.app.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @AfterThrowing：异常增强，当切点出现异常，这个切面就会切入
 */
@Aspect
public class RepairAspect {
    //匹配org.crazyit.app.service.imp包下所有的类
    //所有方法的执行作为切入点
    @AfterThrowing(throwing = "ex",pointcut = "execution(* org.crazyit.app.service.impl.*.*(..))")
    //声明ex时制定的类型会限制目标方法必须抛出指定类型的异常
    //此处将ex的类型声明为Throwable，意味着对目标抛出的异常不加限制
    public void doRecoveryAction(Throwable ex){
        System.out.println("目标方法抛出异常："+ex);
        System.out.println("模拟Advice对异常的修改");
    }
}

package org.crazyit.app.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ReleaseAspect {
    /**
     * @After：切点之后生效，和AfterReturning的区别是切点无论是正常结束还是异常结束，都会切入这个切面
     */
    @After("execution( * org.crazyit.app.service.impl.*.*(..))")
    public void release(){
        System.out.println("模拟方法结束后释放资源！");
    }
}

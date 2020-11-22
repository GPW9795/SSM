package com.gpw.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class BValidateApsect {
    @Before("com.gpw.utils.LogUtils.myPoint()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[ValidateApsect-前置]【" + name + "】方法开始执行，用的参数列表【" + Arrays.asList(args) + "】");
    }

    @AfterReturning(value = "com.gpw.utils.LogUtils.myPoint()", returning = "result")
    public void logReturn(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[ValidateApsect-返回]【" + name + "】方法正常执行完成，计算结果是：" + result);
    }

    @AfterThrowing(value = "com.gpw.utils.LogUtils.myPoint()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("[ValidateApsect-异常]【" + joinPoint.getSignature().getName() + "】方法执行出现异常了，异常信息是【" + exception + "】：；这个异常已经通知测试小组进行排查");
    }

    @After("com.gpw.utils.LogUtils.myPoint()")
    public int logEnd(JoinPoint joinPoint) {
        System.out.println("[ValidateApsect-后置]【" + joinPoint.getSignature().getName() + "】方法最终结束了");
        return 0;
    }
}

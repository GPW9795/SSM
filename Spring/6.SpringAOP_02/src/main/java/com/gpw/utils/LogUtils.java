package com.gpw.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

public class LogUtils {
    public static void logStart(JoinPoint joinPoint) {
        //获取到目标方法运行是使用的参数
        Object[] args = joinPoint.getArgs();
        //获取到方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[LogUtils-前置]【" + name + "】方法开始执行，用的参数列表【" + Arrays.asList(args) + "】");
    }

    public static void logReturn(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("[LogUtils-返回]【" + name + "】方法正常执行完成，计算结果是：" + result);
    }

    public static void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("[LogUtils-异常]【" + joinPoint.getSignature().getName() + "】方法执行出现异常了，异常信息是【" + exception + "】：；这个异常已经通知测试小组进行排查");
    }

    public int logEnd(JoinPoint joinPoint) {
        System.out.println("[LogUtils-后置]【" + joinPoint.getSignature().getName() + "】方法最终结束了");
        return 0;
    }

    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        String name = pjp.getSignature().getName();
        Object proceed = null;
        try {
            System.out.println("[环绕前置]：" + name + "开始");
            proceed = pjp.proceed(args);
            System.out.println("[环绕返回]：" + name + "开始，返回值=" + proceed);
        } catch (Exception e) {
            System.out.println("[环绕异常]：" + name + "开始，异常通知=" + e);
            throw new RuntimeException(e.getCause());
        } finally {
            System.out.println("[环绕后置]：" + name + "开始，方法结束");
        }
        return proceed;
    }

}
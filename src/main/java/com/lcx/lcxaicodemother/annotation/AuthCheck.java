package com.lcx.lcxaicodemother.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //限定注解仅能标注在方法上，符合权限检查的场景需求（如控制器方法、服务层方法）。
@Retention(RetentionPolicy.RUNTIME) //注解在运行时保留，可通过反射动态读取，是实现AOP权限拦截的关键前提。
public @interface AuthCheck {

    /**
     * 必须有某个角色
     */
    String mustRole() default "";
}


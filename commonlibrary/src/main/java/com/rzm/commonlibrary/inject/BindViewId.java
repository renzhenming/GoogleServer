package com.rzm.commonlibrary.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by renzhenming on 2017/8/6.
 * view 注解的annotation
 *
 * @Target(ElementType.FIELD):代表annotation的位置
 * ElementType.FIELD ：属性上  ElementType.TYPE :类上  ElementType.CONSTRUCTOR :构造函数上
 *
 * @Retention(RetentionPolicy.SOURCE) ：代表什么时候生效
 * RetentionPolicy.SOURCE ：源码资源  RetentionPolicy.CLASS :编译时  RetentionPolicy.RUNTIME :运行时
 *
 * int value(); 表示属性的id值
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BindViewId {
    int value();
}

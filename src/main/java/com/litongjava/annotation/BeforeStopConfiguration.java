package com.litongjava.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在启动服务器之后执行的配置类
 * @author 
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AComponent
public @interface BeforeStopConfiguration {
  @AliasFor(annotation = AComponent.class)
  String value() default "";
}

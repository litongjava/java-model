package com.litongjava.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD/**, ElementType.TYPE*/
})
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpCache {
  int timeToIdleSeconds() default 10;

  int timeToLiveSeconds() default 0;

  String[] params();

}

package com.litongjava.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Get {

  /**
   * Specifies the request path for GET requests.
   * Example: "/users"
   * 
   * @return the path as a String
   */
  String value() default "";

  /**
   * Specifies a forward path for GET requests.
   * Note: Variables like "/user/{id}" are not allowed.
   * 
   * @return the forward path as a String
   */
  String forward() default "";
}

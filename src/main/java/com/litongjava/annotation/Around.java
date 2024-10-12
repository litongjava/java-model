package com.litongjava.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Around advice
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Around {

  /**
   * @return the pointcut expression where to bind the advice
   */
  String value();

  /**
   * When compiling without debug info, or when interpreting pointcuts at runtime,
   * the names of any arguments used in the advice declaration are not available.
   * Under these circumstances only, it is necessary to provide the arg names in
   * the annotation - these MUST duplicate the names used in the annotated method.
   * Format is a simple comma-separated list.
   * @return the argument names (should match the names on the annotated method)
   */
  String argNames() default "";

}

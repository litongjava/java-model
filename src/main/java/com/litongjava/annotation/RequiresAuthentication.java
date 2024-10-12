package com.litongjava.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Requires the current subject to be authenticated during method invocation.
 * If the subject is not authenticated, the method will not be executed.
 *
 * Example:
 * <code>
 * &#64;RequiresAuthentication
 * public void someMethod() { ... }
 * </code>
 *
 * @since 0.9
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RequiresAuthentication {
}

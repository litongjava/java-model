package com.litongjava.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Requires the current subject to have all of the specified permissions.
 * If the subject does not have the required permissions, the method will not be executed.
 *
 * Example:
 * <code>
 * &#64;RequiresPermissions("account:create")
 * public void createAccount() { ... }
 * </code>
 *
 * @since 0.9
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RequiresPermissions {
  /**
   * A single String permission or multiple comma-delimited permissions required for the method invocation.
   */
  String[] value();
}

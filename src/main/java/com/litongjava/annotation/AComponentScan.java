package com.litongjava.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface AComponentScan {

  String[] value() default "";

  /**
   * Specifies which types are not eligible for component scanning.
   * @see #resourcePattern
   */
  Filter[] excludeFilters() default {};

  /**
   * Declares the type filter to be used as an {@linkplain AComponentScan#includeFilters
   * include filter} or {@linkplain AComponentScan#excludeFilters exclude filter}.
   */
  @Retention(RetentionPolicy.RUNTIME)
  @Target({})
  @interface Filter {

    /**
     * The type of filter to use.
     * <p>Default is {@link AFilterType#ANNOTATION}.
     * @see #classes
     * @see #pattern
     */
    AFilterType type() default AFilterType.ANNOTATION;

    /**
     * Alias for {@link #classes}.
     * @see #classes
     */
    @AliasFor("classes")
    Class<?>[] value() default {};

    /**
     * The class or classes to use as the filter.
     * <p>The following table explains how the classes will be interpreted
     * based on the configured value of the {@link #type} attribute.
     * <table border="1">
     * <tr><th>{@code FilterType}</th><th>Class Interpreted As</th></tr>
     * <tr><td>{@link AFilterType#ANNOTATION ANNOTATION}</td>
     * <td>the annotation itself</td></tr>
     * <tr><td>{@link AFilterType#ASSIGNABLE_TYPE ASSIGNABLE_TYPE}</td>
     * <td>the type that detected components should be assignable to</td></tr>
     * <tr><td>{@link AFilterType#CUSTOM CUSTOM}</td>
     * <td>an implementation of {@link TypeFilter}</td></tr>
     * </table>
     * <p>When multiple classes are specified, <em>OR</em> logic is applied
     * &mdash; for example, "include types annotated with {@code @Foo} OR {@code @Bar}".
     * <p>Custom {@link TypeFilter TypeFilters} may optionally implement any of the
     * following {@link org.springframework.beans.factory.Aware Aware} interfaces, and
     * their respective methods will be called prior to {@link TypeFilter#match match}:
     * <ul>
     * <li>{@link org.springframework.context.EnvironmentAware EnvironmentAware}</li>
     * <li>{@link org.springframework.beans.factory.BeanFactoryAware BeanFactoryAware}
     * <li>{@link org.springframework.beans.factory.BeanClassLoaderAware BeanClassLoaderAware}
     * <li>{@link org.springframework.context.ResourceLoaderAware ResourceLoaderAware}
     * </ul>
     * <p>Specifying zero classes is permitted but will have no effect on component
     * scanning.
     * @since 4.2
     * @see #value
     * @see #type
     */
    @AliasFor("value")
    Class<?>[] classes() default {};

    /**
     * The pattern (or patterns) to use for the filter, as an alternative
     * to specifying a Class {@link #value}.
     * <p>If {@link #type} is set to {@link AFilterType#ASPECTJ ASPECTJ},
     * this is an AspectJ type pattern expression. If {@link #type} is
     * set to {@link AFilterType#REGEX REGEX}, this is a regex pattern
     * for the fully-qualified class names to match.
     * @see #type
     * @see #classes
     */
    String[] pattern() default {};

  }
}
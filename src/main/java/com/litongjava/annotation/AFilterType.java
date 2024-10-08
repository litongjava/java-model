package com.litongjava.annotation;

/**
 * Enumeration of the type filters that may be used in conjunction with
 * {@link AComponentScan @ComponentScan}.
 *
 * @author Mark Fisher
 * @author Juergen Hoeller
 * @author Chris Beams
 * @since 2.5
 * @see AComponentScan
 * @see AComponentScan#includeFilters()
 * @see AComponentScan#excludeFilters()
 * @see org.springframework.core.type.filter.TypeFilter
 */
public enum AFilterType {

  /**
   * Filter candidates marked with a given annotation.
   * @see org.springframework.core.type.filter.AnnotationTypeFilter
   */
  ANNOTATION,

  /**
   * Filter candidates assignable to a given type.
   * @see org.springframework.core.type.filter.AssignableTypeFilter
   */
  ASSIGNABLE_TYPE,

  /**
   * Filter candidates matching a given AspectJ type pattern expression.
   * @see org.springframework.core.type.filter.AspectJTypeFilter
   */
  ASPECTJ,

  /**
   * Filter candidates matching a given regex pattern.
   * @see org.springframework.core.type.filter.RegexPatternTypeFilter
   */
  REGEX,

  /** Filter candidates using a given custom
   * {@link org.springframework.core.type.filter.TypeFilter} implementation.
   */
  CUSTOM

}

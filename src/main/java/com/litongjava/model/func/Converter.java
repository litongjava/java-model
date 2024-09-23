package com.litongjava.model.func;

/**
 * @author tanyaowu
 * 从F类型转到T类型
 */
public interface Converter<T> {
  /**
   * 
   * @param value
   * @return
   */
  public T convert(Object value);

}

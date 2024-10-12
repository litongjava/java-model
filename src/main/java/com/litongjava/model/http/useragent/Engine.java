package com.litongjava.model.http.useragent;

import java.util.Arrays;
import java.util.List;

/**
 * 引擎对象
 * 
 * @author looly
 * @since 4.2.1
 */
public class Engine extends UserAgentInfo {
  private static final long serialVersionUID = 8140242887565684095L;

  /** 未知 */
  public static final Engine Unknown = new Engine(NameUnknown, null);

  /**
   * 支持的引擎类型
   */
  public static final List<Engine> engines = Arrays.asList(//
      new Engine("Trident", "trident"), //
      new Engine("Webkit", "webkit"), //
      new Engine("Chrome", "chrome"), //
      new Engine("Opera", "opera"), //
      new Engine("Presto", "presto"), //
      new Engine("Gecko", "gecko"), //
      new Engine("KHTML", "khtml"), //
      new Engine("Konqeror", "konqueror"), //
      new Engine("MIDP", "MIDP")//
  );

  /**
   * 构造
   * 
   * @param name  引擎名称
   * @param regex 关键字或表达式
   */
  public Engine(String name, String regex) {
    super(name, regex);
  }

}

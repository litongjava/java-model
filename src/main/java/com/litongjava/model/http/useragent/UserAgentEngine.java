package com.litongjava.model.http.useragent;

import java.util.Arrays;
import java.util.List;

/**
 * 引擎对象
 * 
 * @author looly
 * @since 4.2.1
 */
public class UserAgentEngine extends UserAgentInfo {
  private static final long serialVersionUID = 8140242887565684095L;

  /** 未知 */
  public static final UserAgentEngine Unknown = new UserAgentEngine(NameUnknown, null);

  /**
   * 支持的引擎类型
   */
  public static final List<UserAgentEngine> engines = Arrays.asList(//
      new UserAgentEngine("Trident", "trident"), //
      new UserAgentEngine("Webkit", "webkit"), //
      new UserAgentEngine("Chrome", "chrome"), //
      new UserAgentEngine("Opera", "opera"), //
      new UserAgentEngine("Presto", "presto"), //
      new UserAgentEngine("Gecko", "gecko"), //
      new UserAgentEngine("KHTML", "khtml"), //
      new UserAgentEngine("Konqeror", "konqueror"), //
      new UserAgentEngine("MIDP", "MIDP")//
  );

  /**
   * 构造
   * 
   * @param name  引擎名称
   * @param regex 关键字或表达式
   */
  public UserAgentEngine(String name, String regex) {
    super(name, regex);
  }

}

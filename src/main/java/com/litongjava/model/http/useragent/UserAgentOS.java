package com.litongjava.model.http.useragent;

import java.util.Arrays;
import java.util.List;

/**
 * 系统对象
 * 
 * @author looly
 * @since 4.2.1
 */
public class UserAgentOS extends UserAgentInfo {
  private static final long serialVersionUID = 7241096549074714316L;

  /** 未知 */
  public static final UserAgentOS Unknown = new UserAgentOS(NameUnknown, null);

  /**
   * 支持的引擎类型
   */
  public static final List<UserAgentOS> oses = Arrays.asList(//
      new UserAgentOS("Windows 10 or Windows Server 2016", "windows nt 10\\.0"), //
      new UserAgentOS("Windows 8.1 or Winsows Server 2012R2", "windows nt 6\\.3"), //
      new UserAgentOS("Windows 8 or Winsows Server 2012", "windows nt 6\\.2"), //
      new UserAgentOS("Windows Vista", "windows nt 6\\.0"), //
      new UserAgentOS("Windows 7 or Windows Server 2008R2", "windows nt 6\\.1"), //
      new UserAgentOS("Windows 2003", "windows nt 5\\.2"), //
      new UserAgentOS("Windows XP", "windows nt 5\\.1"), //
      new UserAgentOS("Windows 2000", "windows nt 5\\.0"), //
      new UserAgentOS("Windows Phone", "windows (ce|phone|mobile)( os)?"), //
      new UserAgentOS("Windows", "windows"), //
      new UserAgentOS("OSX", "os x (\\d+)[._](\\d+)"), //
      new UserAgentOS("Android", "Android"), //
      new UserAgentOS("Linux", "linux"), //
      new UserAgentOS("Wii", "wii"), //
      new UserAgentOS("PS3", "playstation 3"), //
      new UserAgentOS("PSP", "playstation portable"), //
      new UserAgentOS("iPad", "\\(iPad.*os (\\d+)[._](\\d+)"), //
      new UserAgentOS("iPhone", "\\(iPhone.*os (\\d+)[._](\\d+)"), //
      new UserAgentOS("YPod", "iPod touch[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)"), //
      new UserAgentOS("YPad", "iPad[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)"), //
      new UserAgentOS("YPhone", "iPhone[\\s\\;]+iPhone.*os (\\d+)[._](\\d+)"), //
      new UserAgentOS("Symbian", "symbian(os)?"), //
      new UserAgentOS("Darwin", "Darwin\\/([\\d\\w\\.\\-]+)"), //
      new UserAgentOS("Adobe Air", "AdobeAir\\/([\\d\\w\\.\\-]+)"), //
      new UserAgentOS("Java", "Java[\\s]+([\\d\\w\\.\\-]+)")//
  );

  /**
   * 构造
   * 
   * @param name  系统名称
   * @param regex 关键字或表达式
   */
  public UserAgentOS(String name, String regex) {
    super(name, regex);
  }

}

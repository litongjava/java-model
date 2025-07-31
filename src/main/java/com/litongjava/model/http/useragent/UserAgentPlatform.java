package com.litongjava.model.http.useragent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 平台对象
 * 
 * @author looly
 * @since 4.2.1
 */
public class UserAgentPlatform extends UserAgentInfo {
  private static final long serialVersionUID = 251639309910040438L;

  /** 未知 */
  public static final UserAgentPlatform Unknown = new UserAgentPlatform(NameUnknown, null);

  /**
   * 支持的移动平台类型
   */
  public static final List<UserAgentPlatform> mobilePlatforms = Arrays.asList(//
      new UserAgentPlatform("Windows Phone", "windows (ce|phone|mobile)( os)?"), //
      new UserAgentPlatform("iPad", "ipad"), //
      new UserAgentPlatform("iPod", "ipod"), //
      new UserAgentPlatform("iPhone", "iphone"), //
      new UserAgentPlatform("Android", "android"), //
      new UserAgentPlatform("Symbian", "symbian(os)?"), //
      new UserAgentPlatform("Blackberry", "blackberry") //
  );

  /**
   * 支持的桌面平台类型
   */
  public static final List<UserAgentPlatform> desktopPlatforms = Arrays.asList(//
      new UserAgentPlatform("Windows", "windows"), //
      new UserAgentPlatform("Mac", "(macintosh|darwin)"), //
      new UserAgentPlatform("Linux", "linux"), //
      new UserAgentPlatform("Wii", "wii"), //
      new UserAgentPlatform("Playstation", "playstation"), //
      new UserAgentPlatform("Java", "java") //
  );

  /**
   * 支持的平台类型
   */
  public static final List<UserAgentPlatform> platforms;
  static {
    platforms = new ArrayList<UserAgentPlatform>(13);
    platforms.addAll(mobilePlatforms);
    platforms.addAll(desktopPlatforms);
  }

  /**
   * 构造
   * 
   * @param name  平台名称
   * @param regex 关键字或表达式
   */
  public UserAgentPlatform(String name, String regex) {
    super(name, regex);
  }

  /**
   * 是否为移动平台
   * 
   * @return 是否为移动平台
   */
  public boolean isMobile() {
    return mobilePlatforms.contains(this);
  }
}

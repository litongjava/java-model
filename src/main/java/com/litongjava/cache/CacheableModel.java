package com.litongjava.cache;

import java.lang.reflect.Method;

import com.jfinal.kit.StrKit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CacheableModel {
  private String name;
  private String key;
  long ttl;

  /**
   * buildCacheModel 
   * @param inv
   * @param target
   * @return
   */
  public static CacheableModel buildCacheModel(Object target, Method method, Object[] args) {
    Cacheable cacheable = method.getAnnotation(Cacheable.class);
    String cacheName = null;
    String cacheKey = null;
    long ttl;
    Class<? extends Object> targetClass = target.getClass();
    if (cacheable != null) {
      String name = cacheable.name();
      if (StrKit.notBlank(name)) {
        cacheName = name;
      } else {
        // 使用类上的Cacheable名称,或者类名
        cacheable = targetClass.getAnnotation(Cacheable.class);
        cacheName = (cacheable != null) ? cacheable.value() : targetClass.getSimpleName();
      }

      String value = cacheable.value();
      if (StrKit.notBlank(name)) {
        cacheKey = value;
      } else {
        // 方法名+参数的hashCode值
        buildCacheKey(method.getName(), args);
      }

      ttl = cacheable.ttl();

    } else {
      cacheable = targetClass.getAnnotation(Cacheable.class);
      if (cacheable != null) {
        String name = cacheable.name();
        if (StrKit.notBlank(name)) {
          cacheName = name;
        } else {
          cacheName = targetClass.getSimpleName();
        }
        ttl = cacheable.ttl();
      } else {
        cacheName = targetClass.getSimpleName();
        cacheKey = buildCacheKey(method.getName(), args);
        ttl = 3600;
      }

    }

    return new CacheableModel(cacheName, cacheKey, ttl);
  }

  /**
   * 返回方法名_参数的hashCode值
   * @param inv
   * @return
   */
  public static String buildCacheKey(String methodName, Object[] args) {
    StringBuilder sb = new StringBuilder(methodName);
    for (Object object : args) {
      sb.append("").append(object.hashCode());

    }
    return sb.toString();
  }
}

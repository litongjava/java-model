package com.litongjava.db;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.kit.Kv;
import com.litongjava.map.SyncWriteMap;

@SuppressWarnings({ "rawtypes" })
public class TableInput extends HashMap {

  /**
   * 缓存线程安全的 DateTimeFormatter
   */
  private static final Map<String, DateTimeFormatter> formaters = new SyncWriteMap<>();

  private static final String datePattern = "yyyy-MM-dd";
  private static final int dateLen = datePattern.length();

  private static final String dateTimeWithoutSecondPattern = "yyyy-MM-dd HH:mm";
  private static final int dateTimeWithoutSecondLen = dateTimeWithoutSecondPattern.length();

  private static final String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

  private static final long serialVersionUID = -808251639784763326L;
  public static final String pageNo = "page_no";
  public static final String pageSize = "page_size";
  public static final String columns = "columns";
  public static final String jsonFields = "json_fields";
  public static final String orderBy = "order_by";
  public static final String isAsc = "is_asc";
  public static final String groupBy = "group_by";
  public static final String table_name = "table_name";
  public static final String search_key = "search_key";

  public TableInput() {
  }

  public static TableInput of(Object key, Object value) {
    return new TableInput().set(key, value);
  }

  public static TableInput by(Object key, Object value) {
    return new TableInput().set(key, value);
  }

  public static TableInput create() {
    return new TableInput();
  }

  @SuppressWarnings("unchecked")
  public TableInput set(Object key, Object value) {
    super.put(key, value);
    return this;
  }

  public TableInput setIfNotBlank(Object key, String value) {
    if (notBlank(value)) {
      set(key, value);
    }
    return this;
  }

  public TableInput setIfNotNull(Object key, Object value) {
    if (value != null) {
      set(key, value);
    }
    return this;
  }

  @SuppressWarnings("unchecked")
  public TableInput set(Map map) {
    super.putAll(map);
    return this;
  }

  @SuppressWarnings("unchecked")
  public TableInput set(Kv kv) {
    super.putAll(kv);
    return this;
  }

  @SuppressWarnings("unchecked")
  public TableInput set(TableInput kv) {
    super.putAll(kv);
    return this;
  }

  public TableInput delete(Object key) {
    super.remove(key);
    return this;
  }

  @SuppressWarnings("unchecked")
  public <T> T getAs(Object key) {
    return (T) get(key);
  }

  @SuppressWarnings("unchecked")
  public <T> T getAs(Object key, T defaultValue) {
    Object ret = get(key);
    return ret != null ? (T) ret : defaultValue;
  }

  public String getStr(Object key) {
    Object s = get(key);
    return s != null ? s.toString() : null;
  }

  public Integer getInt(Object key) {
    return toInt(get(key));
  }

  public Long getLong(Object key) {
    return toLong(get(key));
  }

  public BigDecimal getBigDecimal(Object key) {
    return toBigDecimal(get(key));
  }

  public Double getDouble(Object key) {
    return toDouble(get(key));
  }

  public Float getFloat(Object key) {
    return toFloat(get(key));
  }

  public Number getNumber(Object key) {
    return toNumber(get(key));
  }

  public Boolean getBoolean(Object key) {
    return toBoolean(get(key));
  }

  public java.util.Date getDate(Object key) {
    return toDate(get(key));
  }

  public java.time.LocalDateTime getLocalDateTime(Object key) {
    return toLocalDateTime(get(key));
  }

  /**
   * key 存在，并且 value 不为 null
   */
  public boolean notNull(Object key) {
    return get(key) != null;
  }

  /**
   * key 不存在，或者 key 存在但 value 为null
   */
  public boolean isNull(Object key) {
    return get(key) == null;
  }

  /**
   * key 存在，并且 value 为 true，则返回 true
   */
  public boolean isTrue(Object key) {
    Object value = get(key);
    return value != null && toBoolean(value);
  }

  /**
   * key 存在，并且 value 为 false，则返回 true
   */
  public boolean isFalse(Object key) {
    Object value = get(key);
    return value != null && !toBoolean(value);
  }

  public boolean equals(Object kv) {
    return kv instanceof Kv && super.equals(kv);
  }

  @SuppressWarnings({ "unchecked" })
  public TableInput keep(String... keys) {
    if (keys != null && keys.length > 0) {
      Kv newKv = Kv.create();
      for (String k : keys) {
        if (containsKey(k)) { // 避免将并不存在的变量存为 null
          newKv.put(k, get(k));
        }
      }

      clear();
      putAll(newKv);
    } else {
      clear();
    }

    return this;
  }

  @SuppressWarnings("unchecked")
  public <K, V> Map<K, V> toMap() {
    return this;
  }

  public TableInput setFrom(String from) {
    set(table_name, from);
    return this;
  }

  public String getFrom() {
    return getStr(table_name);
  }

  public TableInput from(String from) {
    set(table_name, from);
    return this;
  }

  public String from() {
    return getStr(table_name);
  }

  public TableInput setColumns(String inputColumns) {
    set(columns, inputColumns);
    return this;
  }

  public TableInput columns(String inputColumns) {
    set(columns, inputColumns);
    return this;
  }

  public String getColumns() {
    return getStr(columns);
  }

  public TableInput setJsonFields(String[] inputJsonFields) {
    set(jsonFields, inputJsonFields);
    return this;
  }

  public String[] getJsonFields() {
    return getAs(jsonFields);
  }

  public TableInput setOrderBy(String inputOrderBy) {
    set(orderBy, inputOrderBy);
    return this;
  }

  public TableInput orderBy(String inputOrderBy) {
    set(orderBy, inputOrderBy);
    return this;
  }

  public String getOrderBy() {
    return getStr(orderBy);
  }

  public TableInput setGroupBy(String inputGroupBy) {
    set(orderBy, inputGroupBy);
    return this;
  }

  public String getGroupBy() {
    return getStr(groupBy);
  }

  public TableInput setPageNo(Integer inputPageNo) {
    return set(pageNo, inputPageNo);
  }

  public TableInput pageNo(int inputPageNo) {
    return set(pageNo, inputPageNo);
  }

  public Integer getPageNo() {
    return getInt(pageNo);
  }

  public TableInput setPageSize(Integer inputPageSize) {
    return set(pageSize, inputPageSize);
  }

  public TableInput pageSize(Integer inputPageSize) {
    return set(pageSize, inputPageSize);
  }

  public TableInput limit(Integer inputPageSize) {
    return set(pageSize, inputPageSize);
  }

  public TableInput limit(Integer inputPageNo, Integer inputPageSize) {
    set(pageNo, inputPageNo);
    return set(pageSize, inputPageSize);
  }

  public Integer getPageSize() {
    return getInt(pageSize);
  }

  public TableInput setAsc(Boolean inputIsAsc) {
    return set(isAsc, inputIsAsc);
  }

  public TableInput asc(boolean inputIsAsc) {
    return set(isAsc, inputIsAsc);
  }

  public Boolean isAsc() {
    return getBoolean(isAsc);
  }

  public TableInput setSearchKey(String input) {
    return setIfNotNull(search_key, input);
  }

  public String getSearchKey() {
    return getStr(search_key);
  }

  public TableInput searchKey(String input) {
    return setIfNotNull(search_key, input);
  }

  public String searchKey() {
    return getStr(search_key);
  }

  @SuppressWarnings("unchecked")
  public TableInput addJsonField(String jsonField) {
    Object object = get(jsonFields);
    if (object != null && object instanceof List) {
      List<String> lists = (List) object;
      lists.add(jsonField);
    } else {
      List<String> list = new ArrayList<>();
      list.add(jsonField);
      put(jsonFields, list);
    }
    return this;
  }

  @SuppressWarnings("unchecked")
  public TableInput setJsonFieldString(String jsonFieldString) {
    put(jsonFields, jsonFieldString);
    return this;
  }

  public TableInput setOp(String field, String value) {
    return set(field + "_op", value);
  }

  public static String toStr(Object s) {
    return s != null ? s.toString() : null;
  }

  public static Integer toInt(Object n) {
    if (n instanceof Integer) {
      return (Integer) n;
    } else if (n instanceof Number) {
      return ((Number) n).intValue();
    }
    // 支持 String 类型转换
    return n != null ? Integer.parseInt(n.toString()) : null;
  }

  public static Long toLong(Object n) {
    if (n instanceof Long) {
      return (Long) n;
    } else if (n instanceof Number) {
      return ((Number) n).longValue();
    }
    // 支持 String 类型转换
    return n != null ? Long.parseLong(n.toString()) : null;
  }

  public static Double toDouble(Object n) {
    if (n instanceof Double) {
      return (Double) n;
    } else if (n instanceof Number) {
      return ((Number) n).doubleValue();
    }
    // 支持 String 类型转换
    return n != null ? Double.parseDouble(n.toString()) : null;
  }

  public static BigDecimal toBigDecimal(Object n) {
    if (n instanceof BigDecimal) {
      return (BigDecimal) n;
    } else if (n != null) {
      return new BigDecimal(n.toString());
    } else {
      return null;
    }
  }

  public static Float toFloat(Object n) {
    if (n instanceof Float) {
      return (Float) n;
    } else if (n instanceof Number) {
      return ((Number) n).floatValue();
    }
    // 支持 String 类型转换
    return n != null ? Float.parseFloat(n.toString()) : null;
  }

  public static Short toShort(Object n) {
    if (n instanceof Short) {
      return (Short) n;
    } else if (n instanceof Number) {
      return ((Number) n).shortValue();
    }
    // 支持 String 类型转换
    return n != null ? Short.parseShort(n.toString()) : null;
  }

  public static Byte toByte(Object n) {
    if (n instanceof Byte) {
      return (Byte) n;
    } else if (n instanceof Number) {
      return ((Number) n).byteValue();
    }
    // 支持 String 类型转换
    return n != null ? Byte.parseByte(n.toString()) : null;
  }

  public static Boolean toBoolean(Object b) {
    if (b instanceof Boolean) {
      return (Boolean) b;
    } else if (b == null) {
      return null;
    }

    // 支持 Number 之下的整数类型
    if (b instanceof Number) {
      if (b instanceof Integer || b instanceof Long || b instanceof BigInteger || b instanceof Byte || b instanceof Short) {
        int n = ((Number) b).intValue();
        if (n == 1) {
          return Boolean.TRUE;
        } else if (n == 0) {
          return Boolean.FALSE;
        }
      }
      // Number 之下的其它类型需要抛出异常提示调用方，例如 Double、Float、BigDecimal
      return (Boolean) b;
    }

    // 支持 String
    if (b instanceof String) {
      String s = b.toString();
      if ("true".equalsIgnoreCase(s) || "1".equals(s)) {
        return Boolean.TRUE;
      } else if ("false".equalsIgnoreCase(s) || "0".equals(s)) {
        return Boolean.FALSE;
      }
    }

    return (Boolean) b;
  }

  public static Number toNumber(Object n) {
    if (n instanceof Number) {
      return (Number) n;
    } else if (n == null) {
      return null;
    }

    // 支持 String 类型转换
    String s = n.toString();
    return s.indexOf('.') != -1 ? Double.parseDouble(s) : Long.parseLong(s);
  }

  public static java.util.Date toDate(Object d) {
    if (d instanceof java.util.Date) {
      return (java.util.Date) d;
    }

    if (d instanceof Temporal) {
      if (d instanceof LocalDateTime) {
        return toDate((LocalDateTime) d);
      }
      if (d instanceof LocalDate) {
        return toDate((LocalDate) d);
      }
      if (d instanceof LocalTime) {
        return toDate((LocalTime) d);
      }
    }

    if (d instanceof String) {
      String s = (String) d;
      if (s.length() <= dateLen) {
        return parse(s, datePattern);
      } else if (s.length() > dateTimeWithoutSecondLen) {
        return parse(s, dateTimePattern);
      } else {
        // 判断冒号字符是否出现两次，月、日、小时、分、秒都允许是一位数，例如：2022-1-2 3:4:5
        int index = s.indexOf(':');
        if (index != -1) {
          if (index != s.lastIndexOf(':')) {
            return parse(s, dateTimePattern);
          } else {
            return parse(s, dateTimeWithoutSecondPattern);
          }
        }
      }
    }

    return (java.util.Date) d;
  }

  public static LocalDateTime toLocalDateTime(Object ldt) {
    if (ldt instanceof LocalDateTime) {
      return (LocalDateTime) ldt;
    }

    if (ldt instanceof java.util.Date) {
      return toLocalDateTime((java.util.Date) ldt);
    }
    if (ldt instanceof LocalDate) {
      return ((LocalDate) ldt).atStartOfDay();
    }
    if (ldt instanceof LocalTime) {
      return LocalDateTime.of(LocalDate.now(), (LocalTime) ldt);
    }

    if (ldt instanceof String) {
      String s = (String) ldt;
      if (s.length() <= dateLen) {
        return parseLocalDateTime(s, datePattern);
      } else if (s.length() > dateTimeWithoutSecondLen) {
        return parseLocalDateTime(s, dateTimePattern);
      } else {
        // 判断冒号字符是否出现两次，月、日、小时、分、秒都允许是一位数，例如：2022-1-2 3:4:5
        int index = s.indexOf(':');
        if (index != -1) {
          if (index != s.lastIndexOf(':')) {
            return parseLocalDateTime(s, dateTimePattern);
          } else {
            return parseLocalDateTime(s, dateTimeWithoutSecondPattern);
          }
        }
      }
    }

    return (LocalDateTime) ldt;
  }

  public boolean notBlank(String value) {
    return value != null && value.length() != 0;
  }

  public static DateTimeFormatter getDateTimeFormatter(String pattern) {
    DateTimeFormatter ret = formaters.get(pattern);
    if (ret == null) {
      ret = DateTimeFormatter.ofPattern(pattern);
      formaters.put(pattern, ret);
    }
    return ret;
  }

  /**
   * 结合 ThreadLocal 缓存 "非线程安全" 的 SimpleDateFormat
   */
  private static final ThreadLocal<HashMap<String, SimpleDateFormat>> TL = ThreadLocal.withInitial(() -> new HashMap<>());

  public static SimpleDateFormat getSimpleDateFormat(String pattern) {
    SimpleDateFormat ret = TL.get().get(pattern);
    if (ret == null) {
      ret = new SimpleDateFormat(pattern);
      TL.get().put(pattern, ret);
    }
    return ret;
  }

  /**
   * 按指定 pattern 将当前时间转换成 String
   * 例如：now("yyyy-MM-dd HH:mm:ss")
   */
  public static String now(String pattern) {
    return LocalDateTime.now().format(getDateTimeFormatter(pattern));
  }

  /**
   * 按指定 pattern 将 LocalDateTime 转换成 String
   * 例如：format(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss")
   */
  public static String format(LocalDateTime localDateTime, String pattern) {
    return localDateTime.format(getDateTimeFormatter(pattern));
  }

  public static String format(LocalDateTime localDateTime) {
    return format(localDateTime, "yyyy-MM-dd HH:mm:ss");
  }

  /**
   * 按指定 pattern 将 LocalDate 转换成 String
   */
  public static String format(LocalDate localDate, String pattern) {
    return localDate.format(getDateTimeFormatter(pattern));
  }

  /**
   * 按指定 pattern 将 LocalTime 转换成 String
   */
  public static String format(LocalTime localTime, String pattern) {
    return localTime.format(getDateTimeFormatter(pattern));
  }

  /**
   * 按指定 pattern 将 Date 转换成 String
   * 例如：format(new Date(), "yyyy-MM-dd HH:mm:ss")
   */
  public static String format(Date date, String pattern) {
    return getSimpleDateFormat(pattern).format(date);
  }

  public static String format(Date date) {
    return format(date, "yyyy-MM-dd HH:mm:ss");
  }

  /**
   * 按指定 pattern 将 String 转换成 Date
   */
  public static Date parse(String dateString, String pattern) {
    try {
      return getSimpleDateFormat(pattern).parse(dateString);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * 按指定 pattern 将 String 转换成 LocalDateTime
   */
  public static LocalDateTime parseLocalDateTime(String localDateTimeString, String pattern) {
    return LocalDateTime.parse(localDateTimeString, getDateTimeFormatter(pattern));
  }

  /**
   * 按指定 pattern 将 String 转换成 LocalDate
   */
  public static LocalDate parseLocalDate(String localDateString, String pattern) {
    return LocalDate.parse(localDateString, getDateTimeFormatter(pattern));
  }

  /**
   * 按指定 pattern 将 String 转换成 LocalTime
   */
  public static LocalTime parseLocalTime(String localTimeString, String pattern) {
    return LocalTime.parse(localTimeString, getDateTimeFormatter(pattern));
  }

  /**
   * 判断 A 的时间是否在 B 的时间 "之后"
   */
  public static boolean isAfter(ChronoLocalDateTime<?> self, ChronoLocalDateTime<?> other) {
    return self.isAfter(other);
  }

  /**
   * 判断 A 的时间是否在 B 的时间 "之前"
   */
  public static boolean isBefore(ChronoLocalDateTime<?> self, ChronoLocalDateTime<?> other) {
    return self.isBefore(other);
  }

  /**
   * 判断 A 的时间是否与 B 的时间 "相同"
   */
  public static boolean isEqual(ChronoLocalDateTime<?> self, ChronoLocalDateTime<?> other) {
    return self.isEqual(other);
  }

  /**
   * java.util.Date --> java.time.LocalDateTime
   */
  public static LocalDateTime toLocalDateTime(Date date) {
    // java.sql.Date 不支持 toInstant()，需要先转换成 java.util.Date
    if (date instanceof java.sql.Date) {
      date = new Date(date.getTime());
    }

    Instant instant = date.toInstant();
    ZoneId zone = ZoneId.systemDefault();
    return LocalDateTime.ofInstant(instant, zone);
  }

  /**
   * java.util.Date --> java.time.LocalDate
   */
  public static LocalDate toLocalDate(Date date) {
    // java.sql.Date 不支持 toInstant()，需要先转换成 java.util.Date
    if (date instanceof java.sql.Date) {
      date = new Date(date.getTime());
    }

    Instant instant = date.toInstant();
    ZoneId zone = ZoneId.systemDefault();
    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
    return localDateTime.toLocalDate();
  }

  /**
   * java.util.Date --> java.time.LocalTime
   */
  public static LocalTime toLocalTime(Date date) {
    // java.sql.Date 不支持 toInstant()，需要先转换成 java.util.Date
    if (date instanceof java.sql.Date) {
      date = new Date(date.getTime());
    }

    Instant instant = date.toInstant();
    ZoneId zone = ZoneId.systemDefault();
    LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
    return localDateTime.toLocalTime();
  }

  /**
   * java.time.LocalDateTime --> java.util.Date
   */
  public static Date toDate(LocalDateTime localDateTime) {
    ZoneId zone = ZoneId.systemDefault();
    Instant instant = localDateTime.atZone(zone).toInstant();
    return Date.from(instant);
  }

  /**
   * java.time.LocalDate --> java.util.Date
   */
  public static Date toDate(LocalDate localDate) {
    ZoneId zone = ZoneId.systemDefault();
    Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
    return Date.from(instant);
  }

  /**
   * java.time.LocalTime --> java.util.Date
   */
  public static Date toDate(LocalTime localTime) {
    LocalDate localDate = LocalDate.now();
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    ZoneId zone = ZoneId.systemDefault();
    Instant instant = localDateTime.atZone(zone).toInstant();
    return Date.from(instant);
  }

  /**
   * java.time.LocalTime --> java.util.Date
   */
  public static Date toDate(LocalDate localDate, LocalTime localTime) {
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    ZoneId zone = ZoneId.systemDefault();
    Instant instant = localDateTime.atZone(zone).toInstant();
    return Date.from(instant);
  }

}

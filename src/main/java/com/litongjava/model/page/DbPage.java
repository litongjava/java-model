package com.litongjava.model.page;

import java.util.List;


public class DbPage<T> implements java.io.Serializable {
  private static final long serialVersionUID = -17665940529965945L;
  private Integer total;
  private List<T> list;
  public DbPage() {
    super();
    // TODO Auto-generated constructor stub
  }
  public DbPage(Integer total, List<T> list) {
    super();
    this.total = total;
    this.list = list;
  }
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }
  public List<T> getList() {
    return list;
  }
  public void setList(List<T> list) {
    this.list = list;
  }
  public static long getSerialversionuid() {
    return serialVersionUID;
  }
}
package com.litongjava.model.page;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DbPage<T> implements java.io.Serializable {
  private static final long serialVersionUID = -17665940529965945L;
  private Integer total;
  private List<T> list;
}
package com.litongjava.model.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenericEntity {
  private Long id;
  private String s_id;
  private String name;

  public GenericEntity(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public GenericEntity(String id, String name) {
    this.s_id = id;
    this.name = name;
  }

}

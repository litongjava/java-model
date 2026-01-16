package com.litongjava.model.result;

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

  public GenericEntity() {
    super();
    // TODO Auto-generated constructor stub
  }

  public GenericEntity(Long id, String s_id, String name) {
    super();
    this.id = id;
    this.s_id = s_id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getS_id() {
    return s_id;
  }

  public void setS_id(String s_id) {
    this.s_id = s_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

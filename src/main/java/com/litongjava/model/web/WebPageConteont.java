package com.litongjava.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WebPageConteont {
  private String title;
  private String url;
  private String description;
  private String content;

  public WebPageConteont(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public WebPageConteont(String title, String url, String content) {
    this.title = title;
    this.url = url;
    this.content = content;
  }
}

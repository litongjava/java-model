package com.litongjava.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WebPageContent {
  private String title;
  private String url;
  private String description;
  private String content;
  private Double similarity;

  public WebPageContent(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public WebPageContent(String title, String url, String description) {
    this.title = title;
    this.url = url;
    this.description = description;
  }

  public WebPageContent(String title, String url, String description, String content) {
    this.title = title;
    this.url = url;
    this.description = description;
    this.content = content;
  }
}

package com.litongjava.model.web;

public class WebPageContent {
  private String title;
  private String url;
  private String description;
  private String content;
  private Double similarity;
  private String thumbnail;

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

  public WebPageContent() {
    super();
    // TODO Auto-generated constructor stub
  }

  public WebPageContent(String title, String url, String description, String content, Double similarity,
      String thumbnail) {
    super();
    this.title = title;
    this.url = url;
    this.description = description;
    this.content = content;
    this.similarity = similarity;
    this.thumbnail = thumbnail;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Double getSimilarity() {
    return similarity;
  }

  public void setSimilarity(Double similarity) {
    this.similarity = similarity;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }
}

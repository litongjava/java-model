package com.litongjava.model.upload;

public class UploadResult {
  private Long id;
  private Long size;
  private String name, targetName, url, md5, etag;
  private String content;
  private String etag2;
  private String url2;

  public UploadResult(long id, String filename, Long size, String url, String md5) {
    this.id = id;
    this.name = filename;
    this.size = size;
    this.url = url;
    this.md5 = md5;
  }

  public UploadResult(long id, String filename, String url, String md5) {
    this.id = id;
    this.name = filename;
    this.url = url;
    this.md5 = md5;
  }

  public UploadResult(long id, String filename, String targetName, String url, String md5) {
    this.id = id;
    this.name = filename;
    this.targetName = targetName;
    this.url = url;
    this.md5 = md5;
  }

  public UploadResult(String etag, String url) {
    this.etag = etag;
    this.url = url;
  }

  public UploadResult() {
    super();
  }

  public UploadResult(Long id, Long size, String name, String targetName, String url, String md5, String etag,
      String content, String etag2, String url2) {
    super();
    this.id = id;
    this.size = size;
    this.name = name;
    this.targetName = targetName;
    this.url = url;
    this.md5 = md5;
    this.etag = etag;
    this.content = content;
    this.etag2 = etag2;
    this.url2 = url2;
  }

  public Long getId() {
    return id;
  }

  public UploadResult setId(Long id) {
    this.id = id;
    return this;
  }

  public Long getSize() {
    return size;
  }

  public UploadResult setSize(Long size) {
    this.size = size;
    return this;
  }

  public String getName() {
    return name;
  }

  public UploadResult setName(String name) {
    this.name = name;
    return this;
  }

  public String getTargetName() {
    return targetName;
  }

  public UploadResult setTargetName(String targetName) {
    this.targetName = targetName;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public UploadResult setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getMd5() {
    return md5;
  }

  public UploadResult setMd5(String md5) {
    this.md5 = md5;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UploadResult setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getContent() {
    return content;
  }

  public UploadResult setContent(String content) {
    this.content = content;
    return this;
  }

  public String getEtag2() {
    return etag2;
  }

  public UploadResult setEtag2(String etag2) {
    this.etag2 = etag2;
    return this;
  }

  public String getUrl2() {
    return url2;
  }

  public UploadResult setUrl2(String url2) {
    this.url2 = url2;
    return this;
  }
}

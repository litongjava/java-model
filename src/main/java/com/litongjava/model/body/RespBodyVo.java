package com.litongjava.model.body;

import com.litongjava.model.error.ErrorVo;
import com.litongjava.model.resp.RespCode;

/**
 * @author tanyaowu
 * 2017年8月18日 下午3:54:27
 */
public class RespBodyVo implements java.io.Serializable {
  private static final long serialVersionUID = 7492427869347211588L;

  /**
   * 业务编码：一般是在失败情况下会用到这个，以便告知用户失败的原因是什么
   */
  private Integer code;

  /**
   * 业务数据，譬如分页数据，用户信息数据等
   */
  private Object data;

  /**
   * 消息，一般用于显示
   */
  private String msg;

  private ErrorVo error;

  public static RespBodyVo fail() {
    RespBodyVo resp = new RespBodyVo(RespCode.FAIL);
    resp.code = 0;
    return resp;
  }

  public static RespBodyVo error(ErrorVo error) {
    RespBodyVo resp = new RespBodyVo(error);
    return resp;
  }

  public static RespBodyVo fail(String msg) {
    return fail().msg(msg);
  }

  public static RespBodyVo failData(Object data) {
    return fail().setData(data);
  }

  public static RespBodyVo ok() {
    RespBodyVo resp = new RespBodyVo(RespCode.OK);
    resp.code = 1;
    return resp;
  }

  public static RespBodyVo ok(Object data) {
    return ok().data(data);
  }

  public static RespBodyVo ok(String msg, Object data) {
    RespBodyVo resp = new RespBodyVo(RespCode.OK);
    resp.code = 1;
    resp.msg = msg;
    resp.data = data;
    return resp;
  }

  public static RespBodyVo fail(int code, String msg) {
    RespBodyVo resp = new RespBodyVo(RespCode.FAIL);
    resp.code = code;
    resp.msg = msg;
    return resp;

  }

  /**
   *
   * @author tanyaowu
   */
  private RespBodyVo(RespCode respCode) {
    this.code = respCode.value;
  }

  public RespBodyVo code(Integer code) {
    this.setCode(code);
    return this;
  }

  public RespBodyVo data(Object data) {
    this.setData(data);
    return this;
  }

  private RespBodyVo(ErrorVo error) {
    this.code = 0;
    this.error = error;
  }

  public Integer getCode() {
    return code;
  }

  public Object getData() {
    return data;
  }

  public String getMsg() {
    return msg;
  }

  public boolean isOk() {
    return this.code == RespCode.OK.value;
  }

  public RespBodyVo msg(String msg) {
    this.setMsg(msg);
    return this;
  }

  public RespBodyVo setCode(Integer code) {
    this.code = code;
    return this;
  }

  public RespBodyVo setData(Object data) {
    this.data = data;
    return this;
  }

  public RespBodyVo setMsg(String msg) {
    this.msg = msg;
    return this;
  }

  public ErrorVo getError() {
    return error;
  }

  public void setError(ErrorVo error) {
    this.error = error;
  }

}

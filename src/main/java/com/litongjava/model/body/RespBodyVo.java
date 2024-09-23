package com.litongjava.model.body;

import com.litongjava.model.resp.RespCode;

/**
 * @author tanyaowu
 * 2017年8月18日 下午3:54:27
 */
public class RespBodyVo implements java.io.Serializable {
  private static final long serialVersionUID = 7492427869347211588L;

  public static RespBodyVo fail() {
    RespBodyVo resp = new RespBodyVo(RespCode.FAIL);
    resp.code = 0;
    return resp;
  }

  public static RespBodyVo fail(String msg) {
    return fail().msg(msg);
  }

  public static RespBodyVo ok() {
    RespBodyVo resp = new RespBodyVo(RespCode.OK);
    resp.code = 1;
    return resp;
  }

  public static RespBodyVo ok(Object data) {
    return ok().data(data);
  }

  /**
   * 结果：成功、失败或未知
   */
  private RespCode result;

  /**
   * 消息，一般用于显示
   */
  private String msg;

  /**
   * 业务数据，譬如分页数据，用户信息数据等
   */
  private Object data;

  /**
   * 业务编码：一般是在失败情况下会用到这个，以便告知用户失败的原因是什么
   */
  private Integer code;

  /**
   *
   * @author tanyaowu
   */
  private RespBodyVo(RespCode respCode) {
    this.result = respCode;
  }

  public RespBodyVo code(Integer code) {
    this.setCode(code);
    return this;
  }

  public RespBodyVo data(Object data) {
    this.setData(data);
    return this;
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
    return this.result == RespCode.OK;
  }

  public RespBodyVo msg(String msg) {
    this.setMsg(msg);
    return this;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}

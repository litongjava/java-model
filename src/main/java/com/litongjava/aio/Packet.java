package com.litongjava.aio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author tanyaowu 
 * 2017年4月1日 上午9:34:59
 */
public class Packet implements java.io.Serializable, Cloneable {
  private static final long serialVersionUID = 5275372187150637318L;
  private static final AtomicLong ID_ATOMICLONG = new AtomicLong();
  private Long id = ID_ATOMICLONG.incrementAndGet();
  /**
   * 本packet在解码时，消耗的字节数
   */
  private int byteCount = 0;
  private Long respId = null;
  private boolean blockSend = false;
  private PacketMeta meta = null;
  /**
   * 消息是否是另外一台机器通过topic转过来的，如果是就不要死循环地再一次转发啦 
   * 这个属性是tio内部使用，业务层的用户请勿使用
   */
  private boolean isFromCluster = false;
  /**
   * 同步发送时，需要的同步序列号
   */
  private Integer synSeq = 0;
  /**
   * 预编码过的bytebuffer，如果此值不为null，框架则会忽略原来的encode()而直接用此值
   */
  private ByteBuffer preEncodedByteBuffer = null;
  /**
   * 是否已经进行ssl加密过
   */
  private boolean isSslEncrypted = false;

  protected boolean keepConnection = true;

  /**
   * 标记是否使用零拷贝传输
   */
  private transient boolean zeroCopy = false;
  /**
   * 零拷贝传输使用的文件通道
   */
  private transient FileChannel zeroCopyFileChannel;
  /**
   * 零拷贝传输的数据长度
   */
  private transient long zeroCopyFileLength = 0;

  public void setKeepConnection(boolean keepedConnection) {
    this.keepConnection = keepedConnection;
  }

  public boolean isKeepConnection() {
    return keepConnection;
  }

  @Override
  public Packet clone() {
    try {
      Packet ret = (Packet) super.clone();
      ret.setPreEncodedByteBuffer(null);
      ret.setSslEncrypted(false);
      // 注意：clone时不复制零拷贝相关的状态
      ret.clearZeroCopy();
      return ret;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  public int getByteCount() {
    return byteCount;
  }

  public Long getId() {
    return id;
  }

  public ByteBuffer getPreEncodedByteBuffer() {
    return preEncodedByteBuffer;
  }

  public Long getRespId() {
    return respId;
  }

  public Integer getSynSeq() {
    return synSeq;
  }

  public boolean isBlockSend() {
    return blockSend;
  }

  public String logstr() {
    return "";
  }

  public void setBlockSend(boolean isBlockSend) {
    this.blockSend = isBlockSend;
  }

  public void setByteCount(int byteCount) {
    this.byteCount = byteCount;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setPreEncodedByteBuffer(ByteBuffer preEncodedByteBuffer) {
    this.preEncodedByteBuffer = preEncodedByteBuffer;
  }

  public void setRespId(Long respId) {
    this.respId = respId;
  }

  public void setSynSeq(Integer synSeq) {
    this.synSeq = synSeq;
  }

  public boolean isFromCluster() {
    return isFromCluster;
  }

  public void setFromCluster(boolean isFromCluster) {
    this.isFromCluster = isFromCluster;
  }

  public boolean isSslEncrypted() {
    return isSslEncrypted;
  }

  public void setSslEncrypted(boolean isSslEncrypted) {
    this.isSslEncrypted = isSslEncrypted;
  }

  public PacketMeta getMeta() {
    return meta;
  }

  public void setMeta(PacketMeta meta) {
    this.meta = meta;
  }

  /**
   * 设置零拷贝传输数据。调用后，Packet 将使用指定的 FileChannel 以及文件长度进行零拷贝传输，
   * 发送时框架需要检测 isZeroCopy() 为 true 时使用底层的零拷贝方法。
   *
   * @param fileChannel 零拷贝传输使用的文件通道
   * @param fileLength  传输数据的长度
   */
  public void setZeroCopy(FileChannel fileChannel, long fileLength) {
    this.zeroCopy = true;
    this.zeroCopyFileChannel = fileChannel;
    this.zeroCopyFileLength = fileLength;
    // 清空预编码的 ByteBuffer，确保发送时使用零拷贝
    this.preEncodedByteBuffer = null;
  }

  /**
   * 是否启用了零拷贝传输
   *
   * @return true 如果使用零拷贝传输
   */
  public boolean isZeroCopy() {
    return zeroCopy;
  }

  /**
   * 返回零拷贝传输使用的 FileChannel 对象
   *
   * @return FileChannel 对象
   */
  public FileChannel getZeroCopyFileChannel() {
    return zeroCopyFileChannel;
  }

  /**
   * 返回零拷贝传输的数据长度
   *
   * @return 数据长度
   */
  public long getZeroCopyFileLength() {
    return zeroCopyFileLength;
  }

  /**
   * 清除零拷贝传输设置
   */
  public void clearZeroCopy() {
    this.zeroCopy = false;
    this.zeroCopyFileChannel = null;
    this.zeroCopyFileLength = 0;
  }

}

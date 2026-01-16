package com.litongjava.model.sys;

import java.io.File;

public class SystemInfo implements java.io.Serializable {
  private static final long serialVersionUID = -4158984832920624527L;
  
  private int availableProcessors;
  private double systemLoadAverage;
  private long cpuUsage;
  private long totalPhysicalMemorySize;
  private long freePhysicalMemorySize;
  private long usedMemory;
  private long heapMemoryUsed;
  private long heapMemoryMax;
  private long nonHeapMemoryUsed;
  private long nonHeapMemoryMax;
  private String javaVersion;
  private String jvmVendor;
  private long jvmUptime;
  private String osName;
  private String osVersion;
  private String osArch;
  private File[] fileRoots;
  public SystemInfo() {
    super();
    // TODO Auto-generated constructor stub
  }
  public SystemInfo(int availableProcessors, double systemLoadAverage, long cpuUsage, long totalPhysicalMemorySize,
      long freePhysicalMemorySize, long usedMemory, long heapMemoryUsed, long heapMemoryMax, long nonHeapMemoryUsed,
      long nonHeapMemoryMax, String javaVersion, String jvmVendor, long jvmUptime, String osName, String osVersion,
      String osArch, File[] fileRoots) {
    super();
    this.availableProcessors = availableProcessors;
    this.systemLoadAverage = systemLoadAverage;
    this.cpuUsage = cpuUsage;
    this.totalPhysicalMemorySize = totalPhysicalMemorySize;
    this.freePhysicalMemorySize = freePhysicalMemorySize;
    this.usedMemory = usedMemory;
    this.heapMemoryUsed = heapMemoryUsed;
    this.heapMemoryMax = heapMemoryMax;
    this.nonHeapMemoryUsed = nonHeapMemoryUsed;
    this.nonHeapMemoryMax = nonHeapMemoryMax;
    this.javaVersion = javaVersion;
    this.jvmVendor = jvmVendor;
    this.jvmUptime = jvmUptime;
    this.osName = osName;
    this.osVersion = osVersion;
    this.osArch = osArch;
    this.fileRoots = fileRoots;
  }
  public int getAvailableProcessors() {
    return availableProcessors;
  }
  public void setAvailableProcessors(int availableProcessors) {
    this.availableProcessors = availableProcessors;
  }
  public double getSystemLoadAverage() {
    return systemLoadAverage;
  }
  public void setSystemLoadAverage(double systemLoadAverage) {
    this.systemLoadAverage = systemLoadAverage;
  }
  public long getCpuUsage() {
    return cpuUsage;
  }
  public void setCpuUsage(long cpuUsage) {
    this.cpuUsage = cpuUsage;
  }
  public long getTotalPhysicalMemorySize() {
    return totalPhysicalMemorySize;
  }
  public void setTotalPhysicalMemorySize(long totalPhysicalMemorySize) {
    this.totalPhysicalMemorySize = totalPhysicalMemorySize;
  }
  public long getFreePhysicalMemorySize() {
    return freePhysicalMemorySize;
  }
  public void setFreePhysicalMemorySize(long freePhysicalMemorySize) {
    this.freePhysicalMemorySize = freePhysicalMemorySize;
  }
  public long getUsedMemory() {
    return usedMemory;
  }
  public void setUsedMemory(long usedMemory) {
    this.usedMemory = usedMemory;
  }
  public long getHeapMemoryUsed() {
    return heapMemoryUsed;
  }
  public void setHeapMemoryUsed(long heapMemoryUsed) {
    this.heapMemoryUsed = heapMemoryUsed;
  }
  public long getHeapMemoryMax() {
    return heapMemoryMax;
  }
  public void setHeapMemoryMax(long heapMemoryMax) {
    this.heapMemoryMax = heapMemoryMax;
  }
  public long getNonHeapMemoryUsed() {
    return nonHeapMemoryUsed;
  }
  public void setNonHeapMemoryUsed(long nonHeapMemoryUsed) {
    this.nonHeapMemoryUsed = nonHeapMemoryUsed;
  }
  public long getNonHeapMemoryMax() {
    return nonHeapMemoryMax;
  }
  public void setNonHeapMemoryMax(long nonHeapMemoryMax) {
    this.nonHeapMemoryMax = nonHeapMemoryMax;
  }
  public String getJavaVersion() {
    return javaVersion;
  }
  public void setJavaVersion(String javaVersion) {
    this.javaVersion = javaVersion;
  }
  public String getJvmVendor() {
    return jvmVendor;
  }
  public void setJvmVendor(String jvmVendor) {
    this.jvmVendor = jvmVendor;
  }
  public long getJvmUptime() {
    return jvmUptime;
  }
  public void setJvmUptime(long jvmUptime) {
    this.jvmUptime = jvmUptime;
  }
  public String getOsName() {
    return osName;
  }
  public void setOsName(String osName) {
    this.osName = osName;
  }
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }
  public String getOsArch() {
    return osArch;
  }
  public void setOsArch(String osArch) {
    this.osArch = osArch;
  }
  public File[] getFileRoots() {
    return fileRoots;
  }
  public void setFileRoots(File[] fileRoots) {
    this.fileRoots = fileRoots;
  }
}

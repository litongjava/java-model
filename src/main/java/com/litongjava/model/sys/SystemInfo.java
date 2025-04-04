package com.litongjava.model.sys;

import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}

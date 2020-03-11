package com.panxr.myecharts.bean;

/**
 * @author PanXR
 * @date 2020/3/9 - 17:53
 */
public class Core {

    private int cpuCore;//cpu核心 -个
    private int memoryDriver;//内存 -G
    private int diskDriver;//硬盘 -G
    private int cpuUsed;//使用cpu -%
    private int memoryUsed;//使用内存 -%
    private int diskUsed;//使用硬盘 -%
    private int image;//镜像 -个

    public Core() {
    }

    public Core(int cpuCore, int memoryDriver, int diskDriver, int cpuUsed, int memoryUsed, int diskUsed, int image) {
        this.cpuCore = cpuCore;
        this.memoryDriver = memoryDriver;
        this.diskDriver = diskDriver;
        this.cpuUsed = cpuUsed;
        this.memoryUsed = memoryUsed;
        this.diskUsed = diskUsed;
        this.image = image;
    }

    public int getCpuCore() {
        return cpuCore;
    }

    public void setCpuCore(int cpuCore) {
        this.cpuCore = cpuCore;
    }

    public int getMemoryDriver() {
        return memoryDriver;
    }

    public void setMemoryDriver(int memoryDriver) {
        this.memoryDriver = memoryDriver;
    }

    public int getDiskDriver() {
        return diskDriver;
    }

    public void setDiskDriver(int diskDriver) {
        this.diskDriver = diskDriver;
    }

    public int getCpuUsed() {
        return cpuUsed;
    }

    public void setCpuUsed(int cpuUsed) {
        this.cpuUsed = cpuUsed;
    }

    public int getMemoryUsed() {
        return memoryUsed;
    }

    public void setMemoryUsed(int memoryUsed) {
        this.memoryUsed = memoryUsed;
    }

    public int getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(int diskUsed) {
        this.diskUsed = diskUsed;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Core{" +
                "cpuCore=" + cpuCore +
                ", memoryDriver=" + memoryDriver +
                ", diskDriver=" + diskDriver +
                ", cpuUsed=" + cpuUsed +
                ", memoryUsed=" + memoryUsed +
                ", diskUsed=" + diskUsed +
                ", image=" + image +
                '}';
    }
}

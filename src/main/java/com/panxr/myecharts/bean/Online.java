package com.panxr.myecharts.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * @author PanXR
 * @date 2020/3/9 - 16:00
 */
public class Online {

    private int userNum;//用户在线
    private int serverNum;//服务在线
    private int robotNum;//机器人在线

    private int userAll;//用户总数
    private int serverAll;//服务总数
    private int robotAll;//机器人总数

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Online() {
    }

    public Online(int userNum, int serverNum, int robotNum, int userAll, int serverAll, int robotAll, Date date) {
        this.userNum = userNum;
        this.serverNum = serverNum;
        this.robotNum = robotNum;
        this.userAll = userAll;
        this.serverAll = serverAll;
        this.robotAll = robotAll;
        this.date = date;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public int getServerNum() {
        return serverNum;
    }

    public void setServerNum(int serverNum) {
        this.serverNum = serverNum;
    }

    public int getRobotNum() {
        return robotNum;
    }

    public void setRobotNum(int robotNum) {
        this.robotNum = robotNum;
    }

    public int getUserAll() {
        return userAll;
    }

    public void setUserAll(int userAll) {
        this.userAll = userAll;
    }

    public int getServerAll() {
        return serverAll;
    }

    public void setServerAll(int serverAll) {
        this.serverAll = serverAll;
    }

    public int getRobotAll() {
        return robotAll;
    }

    public void setRobotAll(int robotAll) {
        this.robotAll = robotAll;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Online{" +
                "userNum=" + userNum +
                ", serverNum=" + serverNum +
                ", robotNum=" + robotNum +
                ", userAll=" + userAll +
                ", serverAll=" + serverAll +
                ", robotAll=" + robotAll +
                ", date=" + date +
                '}';
    }
}

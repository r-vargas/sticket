package com.example.roberto.sticket;

/**
 * Created by Roberto on 5/21/15.
 */
public class indoorlocation {
    private String mac;
    private String name;
    private String desc;
    private int lrrt;
    private loc loc;

    public void setLoc(loc loc) {
        this.loc = loc;
    }

    public loc getLoc(){
        return loc;
    }



    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLrrt() {
        return lrrt;
    }

    public void setLrrt(int lrrt) {
        this.lrrt = lrrt;
    }

}

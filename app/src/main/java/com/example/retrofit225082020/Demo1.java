package com.example.retrofit225082020;

import java.util.Objects;

public class Demo1 {

    /**
     * monhoc : Lập trình Android
     * noihoc : Trung Tâm Đào Tạo Tin Học Khoa Phạm
     * website : http://khoapham.vn
     * fanpage : http://facebook.com/khoapham.vn
     * logo : http://khoapham.vn/public/images/logo-370.png
     */

    private String monhoc;
    private String noihoc;
    private String website;
    private String fanpage;
    private String logo;

    public Demo1() {
    }

    public Demo1(String monhoc, String noihoc, String website, String fanpage, String logo) {
        this.monhoc = monhoc;
        this.noihoc = noihoc;
        this.website = website;
        this.fanpage = fanpage;
        this.logo = logo;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public String getNoihoc() {
        return noihoc;
    }

    public void setNoihoc(String noihoc) {
        this.noihoc = noihoc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFanpage() {
        return fanpage;
    }

    public void setFanpage(String fanpage) {
        this.fanpage = fanpage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "monhoc='" + monhoc + '\'' +
                ", noihoc='" + noihoc + '\'' +
                ", website='" + website + '\'' +
                ", fanpage='" + fanpage + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
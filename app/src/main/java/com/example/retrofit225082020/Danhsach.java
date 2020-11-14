package com.example.retrofit225082020;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Danhsach {

    private String khoahoc;

    /**
     * No args constructor for use in serialization
     */
    public Danhsach() {
    }

    /**
     * @param khoahoc
     */
    public Danhsach(String khoahoc) {
        super();
        this.khoahoc = khoahoc;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

}
package com.example.retrofit225082020;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Demo2 {

    private List<Danhsach> danhsach = null;

    /**
     * No args constructor for use in serialization
     */
    public Demo2() {
    }

    /**
     * @param danhsach
     */
    public Demo2(List<Danhsach> danhsach) {
        super();
        this.danhsach = danhsach;
    }

    public List<Danhsach> getDanhsach() {
        return danhsach;
    }

    public void setDanhsach(List<Danhsach> danhsach) {
        this.danhsach = danhsach;
    }

}
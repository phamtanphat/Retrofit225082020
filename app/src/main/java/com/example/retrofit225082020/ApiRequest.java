package com.example.retrofit225082020;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Demo1> fetchDataDemo1();

    @GET("KhoaPhamTraining/json/tien/demo2.json")
    Call<Demo2> fetchDataDemo2();
}

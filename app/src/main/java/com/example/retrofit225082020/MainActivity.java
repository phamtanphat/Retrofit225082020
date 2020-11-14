package com.example.retrofit225082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImg = findViewById(R.id.imageview);

        // Buoc 1 : Khoi tao retrofit
        Gson gson = new GsonBuilder().setLenient().create();

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

        ApiRequest apiRequest = retrofit.create(ApiRequest.class);

//        Call<Demo1> callbackDemo1 = apiRequest.fetchDataDemo1();
//
//        callbackDemo1.enqueue(new Callback<Demo1>() {
//            @Override
//            public void onResponse(Call<Demo1> call, Response<Demo1> response) {
//                Demo1 demo1 = response.body();
//                Glide
//                        .with(MainActivity.this)
//                        .load(demo1.getLogo())
//                        .placeholder(R.mipmap.ic_launcher)
//                        .error(R.mipmap.ic_launcher)
//                        .dontAnimate()
//                        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
//                        .into(mImg);
//            }
//
//            @Override
//            public void onFailure(Call<Demo1> call, Throwable t) {
//                Log.d("BBB", t.getMessage());
//            }
//        });
        Call<Demo2> callbackDemo2 = apiRequest.fetchDataDemo2();
        callbackDemo2.enqueue(new Callback<Demo2>() {
            @Override
            public void onResponse(Call<Demo2> call, Response<Demo2> response) {
                Demo2 demo2 = response.body();
                for (int i = 0; i <demo2.getDanhsach().size() ; i++) {
                    Log.d("BBB",demo2.getDanhsach().get(i).getKhoahoc());
                }
            }

            @Override
            public void onFailure(Call<Demo2> call, Throwable t) {

            }
        });
    }
}
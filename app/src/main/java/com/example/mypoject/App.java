package com.example.mypoject;

import android.app.Application;

import com.example.mypoject.data.remote.FilmsApi;
import com.example.mypoject.data.remote.RetrofitClient;

import retrofit2.Retrofit;

public class App extends Application {
    private RetrofitClient retrofitClient;
    private FilmsApi api;
    @Override
    public void onCreate(){
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.filmsApiClient();
    }
}

package com.example.mypoject.data.remote;

import com.example.mypoject.data.models.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FilmsApi {
    @GET("/films")
 Call<List<Film>> getFilms();
}

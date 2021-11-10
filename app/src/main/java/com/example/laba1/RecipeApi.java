package com.example.laba1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecipeApi {
    @GET("recipes.json")
    Call<List<Recipe>> recipes();
}

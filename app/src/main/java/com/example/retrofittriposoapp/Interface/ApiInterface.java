package com.example.retrofittriposoapp.Interface;

import com.example.retrofittriposoapp.Model.TriposoModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/20190906/location.json?id=London&account=<cairo>&token=<5fwt5d8x1hcev76reny2we9wzo4ouse7>")
    public Call<TriposoModel.Results> getTriposoCairo();
}

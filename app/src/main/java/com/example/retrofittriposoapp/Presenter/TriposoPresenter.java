package com.example.retrofittriposoapp.Presenter;

import android.content.Context;
import android.widget.Toast;

import com.example.retrofittriposoapp.Interface.ApiInterface;
import com.example.retrofittriposoapp.Interface.PresenterInterface;
import com.example.retrofittriposoapp.Model.TriposoModel;
import com.example.retrofittriposoapp.UI.MainActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TriposoPresenter {
private Context context;
private Retrofit retrofit;
private ApiInterface apiInterface;
private ArrayList<TriposoModel.Results.Images>triposoList;
private PresenterInterface presenterInterface;

    public TriposoPresenter(PresenterInterface presenterInterface) {
        this.presenterInterface = presenterInterface;
    }

    public void DataFromRetrofit()
    {
        retrofit=new Retrofit.Builder()
                .baseUrl("https://www.triposo.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
        Call<TriposoModel.Results>triposoCall=apiInterface.getTriposoCairo();
        triposoCall.enqueue(new Callback<TriposoModel.Results>() {
            @Override
            public void onResponse(Call<TriposoModel.Results> call, Response<TriposoModel.Results> response) {
                 triposoList=response.body().getImages();
                 presenterInterface.SetItemTriposoInRecycleView(triposoList);
            }

            @Override
            public void onFailure(Call<TriposoModel.Results> call, Throwable t) {
                Toast.makeText(context,"onFailure Response",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

    public void setRetrofit(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public ApiInterface getApiInterface() {
        return apiInterface;
    }

    public void setApiInterface(ApiInterface apiInterface) {
        this.apiInterface = apiInterface;
    }

    public ArrayList<TriposoModel.Results.Images> getTriposoList() {
        return triposoList;
    }

    public void setTriposoList(ArrayList<TriposoModel.Results.Images> triposoList) {
        this.triposoList = triposoList;
    }

    public PresenterInterface getPresenterInterface() {
        return presenterInterface;
    }

    public void setPresenterInterface(PresenterInterface presenterInterface) {
        this.presenterInterface = presenterInterface;
    }
}

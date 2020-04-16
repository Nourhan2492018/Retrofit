package com.example.retrofittriposoapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofittriposoapp.Adapter.TriposoAdapter;
import com.example.retrofittriposoapp.Interface.PresenterInterface;
import com.example.retrofittriposoapp.Model.TriposoModel;
import com.example.retrofittriposoapp.Presenter.TriposoPresenter;
import com.example.retrofittriposoapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PresenterInterface {
    private RecyclerView mRecyclerView;
    private TriposoAdapter mTriposoAdapter;
    private   TriposoPresenter triposoPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_triposo_main);
        //setContentView(R.layout.recycle_triposo_main);
        mRecyclerView=findViewById(R.id.recycler_view);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));//??

        triposoPresenter=new TriposoPresenter(this);
        triposoPresenter.DataFromRetrofit();
        SetItemTriposoInRecycleView(triposoPresenter.getTriposoList());
    }


    @Override
    public void SetItemTriposoInRecycleView(ArrayList<TriposoModel.Results.Images> imagesList) {
        mTriposoAdapter=new TriposoAdapter(MainActivity.this,imagesList);
        mRecyclerView.setAdapter(mTriposoAdapter);
    }
}

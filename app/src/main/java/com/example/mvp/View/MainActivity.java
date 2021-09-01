package com.example.mvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.*;

import android.util.Log;

import com.example.mvp.Contract.MainContract;
import com.example.mvp.Presenter.MainPresenter;
import com.example.mvp.R;
import com.example.mvp.Model.User;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements MainContract.View {
private static final String TAG = "MainActivity";
private MainContract.Presenter presenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.onAttach(this);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }


    @Override
    public void ShowData(@NotNull List<User> mutableList) {
        Log.i(TAG, "ShowData: -> "+mutableList);
    }
}
package com.example.mvcexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvcexample.Controller.ILoginController;
import com.example.mvcexample.Controller.LoginController;
import com.example.mvcexample.View.ILoginView;

public class MainActivity extends AppCompatActivity  {
    EditText email,password;
    Button loginb;

    ILoginController loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
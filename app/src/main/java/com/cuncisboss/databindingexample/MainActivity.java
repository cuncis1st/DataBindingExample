package com.cuncisboss.databindingexample;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cuncisboss.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    private MyClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        user.name.set("Karang Reksa Ginolla");
        user.email.set("karang.reksa@gmail.com");

        binding.setUsr(user);

        listener = new MyClickListener(this, user);
        binding.setMyListener(listener);
    }


}

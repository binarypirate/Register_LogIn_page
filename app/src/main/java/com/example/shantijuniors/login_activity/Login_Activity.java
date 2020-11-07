package com.example.shantijuniors.login_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.L;
import com.example.shantijuniors.R;
import com.example.shantijuniors.dashboard.DashBoard;
import com.example.shantijuniors.databinding.ActivityLoginBinding;

public class Login_Activity extends AppCompatActivity {
    ActivityLoginBinding logBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_);

        logBinding = DataBindingUtil.setContentView(this,R.layout.activity_login_);

        logBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (logBinding.mobileNumber.getEditText().toString().trim().isEmpty()){
                    logBinding.mobileNumber.setError(getString(R.string.please_fill_this_field));
                    logBinding.mobileNumber.requestFocus();
                } else if (logBinding.password.getEditText().toString().trim().isEmpty()){
                    logBinding.password.setError(getString(R.string.please_fill_this_field));
                    logBinding.password.getEditText();
                }
                else {
                    Intent intent = new Intent(Login_Activity.this, DashBoard.class);
                    startActivity(intent);
                }
            }
        });
    }
}
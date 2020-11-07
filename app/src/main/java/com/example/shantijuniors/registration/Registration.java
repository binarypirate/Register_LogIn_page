package com.example.shantijuniors.registration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.shantijuniors.R;
import com.example.shantijuniors.databinding.ActivityRegistrationBinding;
import com.example.shantijuniors.databinding.ActivityRegistrationBinding;
import com.example.shantijuniors.login_activity.Login_Activity;
import com.google.android.material.textfield.TextInputLayout;

public class Registration extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    ActivityRegistrationBinding mBinding;
    RadioGroup radioGroup;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_registration);
        radioGroup = findViewById(R.id.radioGroup);


        mBinding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mBinding.name.getEditText().toString().trim().isEmpty()) {
                   mBinding.name.setError(getString(R.string.please_fill_this_field));
                   mBinding.name.requestFocus();
                } else if (mBinding.email.getEditText().toString().trim().isEmpty()) {
                    mBinding.email.setError(getString(R.string.please_fill_this_field));
                    mBinding.email.requestFocus();
                } else if (mBinding.address.getEditText().toString().trim().isEmpty()) {
                    mBinding.address.setError(getString(R.string.please_fill_this_field));
                    mBinding.address.requestFocus();
                } else if (mBinding.mobileNumber.getEditText().toString().trim().isEmpty()) {
                    mBinding.mobileNumber.setError(getString(R.string.please_fill_this_field));
                    mBinding.mobileNumber.requestFocus();
                } else if (mBinding.password.getEditText().toString().trim().isEmpty()) {
                    mBinding.password.setError(getString(R.string.please_fill_this_field));
                    mBinding.password.requestFocus();
                } else {
                    Intent intent = new Intent(Registration.this, Login_Activity.class);
                    startActivity(intent);
                }
            }

        });

        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {

        switch (i){

            case  R.id.male:
            gender = "Male";
            break;

            case  R.id.female:
                gender = "Female";
                break;
        }
    }
}
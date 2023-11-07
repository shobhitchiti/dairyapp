package com.getskn.sakar_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
Button loginBtn;
TextView regLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn=findViewById(R.id.loginBtn);
        regLink=findViewById(R.id.regLink);
        gotoDashboard();
        gotoSignup();
    }

    private void gotoSignup() {
        regLink.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),RegisActivity.class);
            startActivity(intent);
            finish();
        });
    }
    private void gotoDashboard() {
        loginBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),Dashboard.class);
            startActivity(intent);
            finish();
        });
    }
}
package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = findViewById(R.id.txt_login);
        textView.setOnClickListener( view -> {
                Intent intent =new Intent(LoginActivity.this,LoginttActivity.class);
                startActivity(intent);
                }
        );
    }
}
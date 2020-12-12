package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginttActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logintt);
        Button button = findViewById(R.id.bt_tt);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(LoginttActivity.this, SetNameActivity.class);
            startActivity(intent);
        });
    }
}
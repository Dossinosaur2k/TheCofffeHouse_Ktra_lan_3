package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SetNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_name);
        Button button = findViewById(R.id.bt_tt);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(SetNameActivity.this, Home.class);
            startActivity(intent);
        });
    }
}
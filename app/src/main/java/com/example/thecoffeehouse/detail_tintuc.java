package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detail_tintuc extends AppCompatActivity {
    TextView detail, text;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_detail);
        imageView = (ImageView) findViewById(R.id.anh);
        detail = (TextView) findViewById(R.id.titlee);
        text = (TextView) findViewById(R.id.textt);
        Intent intent = getIntent();
        int receivedImage = intent.getIntExtra("image",0);
        String receivedName =  intent.getStringExtra("title");
        String receivedText =  intent.getStringExtra("text");
        imageView.setImageResource(receivedImage);
        detail.setText(receivedName);
        text.setText(receivedText);
    }
}

package com.example.blurimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    BlurImageView blurImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blurImageView = (BlurImageView)findViewById(R.id.blur);
        blurImageView.setBlur(2);
    }
}

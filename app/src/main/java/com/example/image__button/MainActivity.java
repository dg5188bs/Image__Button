package com.example.image__button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageView imageView;
    Random rnd = new Random();
    int j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.imageButton);
        imageView = findViewById(R.id.imageView);

    }

    public void change(View view) {
        j = rnd.nextInt(3) + 1;
        if (j == 1) {
            btn.setImageResource(R.drawable.b1);
            imageView.setImageResource(R.drawable.v1);
        }
        if (j == 2) {
            btn.setImageResource(R.drawable.b2);
            imageView.setImageResource(R.drawable.v2);
        }
        if (j == 3) {
            btn.setImageResource(R.drawable.b3);
            imageView.setImageResource(R.drawable.v3);
        }


    }
    }

package com.example.demoexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        ImageView animationImage = findViewById(R.id.animationImage);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LoadingScreen.this, MainActivity.class));
            }
        }, 3000);

        final Animation animation = AnimationUtils.loadAnimation(LoadingScreen.this, R.anim.animations);

        animationImage.startAnimation(animation);
    }
}
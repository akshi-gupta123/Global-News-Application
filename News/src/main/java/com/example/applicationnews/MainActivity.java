package com.example.applicationnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 4000;
    ImageView imageView;
    TextView textView;
    Animation top,bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.text_view);

        top= AnimationUtils.loadAnimation(this,R.anim.top);
        bottom= AnimationUtils.loadAnimation(this, R.anim.bottom);

        imageView.setAnimation(top);
        textView.setAnimation(bottom);
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  }
                ,SPLASH_SCREEN);
    }
}
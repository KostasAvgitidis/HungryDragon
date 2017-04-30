package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CarouselTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel_two);
        setTitle(R.string.emptyString);
    }

    public void jumpToMainScreen(View view) {
        Intent intent = new Intent(this, IntroScreen.class);
        startActivity(intent); //start of IntroScreen.java
    }
}

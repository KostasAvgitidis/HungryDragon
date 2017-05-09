package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CarouselOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel_one);
        setTitle(R.string.emptyString);


    }

    public void carouselTwo(View view) {
        Intent intent = new Intent(this, CarouselTwo.class);
        startActivity(intent); //start of CarouselTwo.java
    }


}




package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static com.bitthebyte.kostasavgitidis.hungrydragon.R.attr.background;
import static com.bitthebyte.kostasavgitidis.hungrydragon.R.id.imageView;

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




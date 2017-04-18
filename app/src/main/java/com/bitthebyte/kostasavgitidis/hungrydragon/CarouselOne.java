package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CarouselOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousel_one);
        setTitle(R.string.emptyString);
        onClick(buttonName);
    }

    public void carouselTwo(View view) {
        Intent intent = new Intent(this, CarouselTwo.class);
        startActivity(intent); //start of CarouselTwo.java
    }

    ImageButton buttonName = (ImageButton) findViewById(R.id.next_button);

    public void onClick(View v) {
        if (v == buttonName) {
            buttonName.setBackgroundResource(R.drawable.right_arrow3);
        }
    }
}




package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntroScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen);
    }

    public void jumpToRecipeSearch(View view) {
        Intent intent = new Intent(this, RecipeSearch.class);
        startActivity(intent); //start of RecipeSearch.java
    }
}

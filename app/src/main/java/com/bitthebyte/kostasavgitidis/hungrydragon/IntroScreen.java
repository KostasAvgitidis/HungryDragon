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

    public void findCakes(View view) {
        String text = "https://api.edamam.com/search?q=cake%20&app_id=f290a7ef&app_key=049c4ad03438939ccc2a3130d0adfb44&from=0&to=50";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent); //start of MyActivity.java
    }

    public void findBurgers(View view) {
        String text = "https://api.edamam.com/search?q=burger%20&app_id=f290a7ef&app_key=049c4ad03438939ccc2a3130d0adfb44&from=0&to=50";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent); //start of MyActivity.java
    }

    public void findPizzas(View view) {
        String text = "https://api.edamam.com/search?q=pizza%20&app_id=f290a7ef&app_key=049c4ad03438939ccc2a3130d0adfb44&from=0&to=50";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent); //start of MyActivity.java
    }
}

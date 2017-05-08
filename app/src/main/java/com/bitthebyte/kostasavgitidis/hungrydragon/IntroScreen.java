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
        String text = "http://food2fork.com/api/search?key=c60b34b9ca87a32ff0758eb171c2ac13&q=cake";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //start of MainActivity.java
    }

    public void findBurgers(View view) {
        String text = "http://food2fork.com/api/search?key=c60b34b9ca87a32ff0758eb171c2ac13&q=burger";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //start of MainActivity.java
    }

    public void findPizzas(View view) {
        String text = "http://food2fork.com/api/search?key=c60b34b9ca87a32ff0758eb171c2ac13&q=pizza";
        RecipeSearch.setItext(text);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //start of MainActivity.java
    }
}

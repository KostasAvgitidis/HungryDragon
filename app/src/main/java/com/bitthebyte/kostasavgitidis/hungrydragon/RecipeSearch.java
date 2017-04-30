package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class RecipeSearch extends AppCompatActivity {


    private static String itext;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_search);
        et = (EditText) findViewById(R.id.editText);
    }

    public void storeValue(View view) {
        itext = et.getText().toString();
        itext = itext.replaceAll(" ", "%20").toLowerCase();
        itext = "http://food2fork.com/api/search?key=c60b34b9ca87a32ff0758eb171c2ac13&q=" + itext;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); //start of MainActivity.java
    }

    public static String getItext() {
        return itext;
    }

    public static void setItext(String itext) {
        RecipeSearch.itext = itext;
    }
}



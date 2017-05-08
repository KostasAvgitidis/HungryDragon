package com.bitthebyte.kostasavgitidis.hungrydragon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class RecipeSearch extends AppCompatActivity {


    private static String itext;
    EditText et;
    EditText fromEt;
    EditText toEt;
    EditText resultsEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_search);
        et = (EditText) findViewById(R.id.editText);
        fromEt = (EditText) findViewById(R.id.fromEditText);
        toEt = (EditText) findViewById(R.id.toEditText);
        resultsEt = (EditText) findViewById(R.id.resultNumberEditText);
    }

    public void storeValue(View view) {
        itext = et.getText().toString();
        itext = "https://api.edamam.com/search?q=" + itext + "&app_id=f290a7ef&app_key=e872f9068619df645438f4e52127c9b2&from=0&to=" + resultsEt.getText().toString() + "&calories=gte%20"
                + fromEt.getText().toString() +",%20lte%20" + toEt.getText().toString();
        itext = itext.replaceAll(" ", "%20").toLowerCase();

        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent); //start of MyActivity.java
    }

    public static String getItext() {
        return itext;
    }

    public static void setItext(String itext) {
        RecipeSearch.itext = itext;
    }
}


